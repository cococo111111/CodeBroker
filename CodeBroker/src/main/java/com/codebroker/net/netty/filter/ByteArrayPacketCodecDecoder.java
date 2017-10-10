package com.codebroker.net.netty.filter;

import java.util.List;

import com.codebroker.protocol.BaseByteArrayPacket;
import com.codebroker.util.ByteUtils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * 网络数据包解析 |4| |4| |……| 数据包长度 操作码 数据.
 *
 * @author ZERO
 */

public class ByteArrayPacketCodecDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (in.readableBytes() < 4) {
			return;
		}
		in.markReaderIndex();
		System.out.println(in.order()+"in.readableBytes()"+in.readableBytes());
		byte[] bs=new byte[in.readableBytes()];
		in.readBytes(bs);
		String fullHexDump = ByteUtils.fullHexDump(bs);
		System.out.println(fullHexDump);
		System.out.println(new String(bs));
		in.resetReaderIndex();
		in.markReaderIndex();
//		byte[] bs=new byte[in.capacity()];
//		in.readBytes(bs);
////		System.out.println(in.readIntLE());
//		ByteUtils.fullHexDump(bs);
//		in.resetReaderIndex();
		int dataLength = in.readInt();
		System.out.println(dataLength+"======");
		if (in.readableBytes() < dataLength) {
			in.resetReaderIndex();
			return;
		}

		int opcode = in.readInt();
System.out.println("opcode="+opcode);
		byte[] decoded = new byte[dataLength - 4];
		in.readBytes(decoded);
		
		BaseByteArrayPacket messagePack = new BaseByteArrayPacket(opcode, decoded);
		
		out.add(messagePack);

	}

}
