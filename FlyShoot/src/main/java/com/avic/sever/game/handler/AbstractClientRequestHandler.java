package com.avic.sever.game.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codebroker.api.IClientRequestHandler;
import com.codebroker.api.IUser;
import com.google.common.base.Optional;

public abstract class AbstractClientRequestHandler implements IClientRequestHandler{
	private static final Logger logger = LoggerFactory.getLogger(AbstractClientRequestHandler.class);
	protected String userId;
	/**
	 * �ͻ������������
	 */
	public void handleClientRequest(IUser user, Object params) {
		
		String string=new String((byte[])params);
		//�����յ�����Ϣ
		String handleRequest = handleRequest(user,string.trim());
		//����Ϣ�Ͳ��؏�
		if (handleRequest==null) {
			return;
		}
		//����Ϣ
		Integer requestid = getRequestId(getClass()).get();
		sendResponse(requestid, handleRequest, user);
	}

	

	/**
	 * ��������
	 *
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public abstract String handleRequest(IUser user, String jsonString);


	/**
	 * ��������
	 *
	 * @param retObj
	 * @param user
	 */
	public void sendResponse(int requestid, String retObj, IUser user) {
		user.sendMessageToIoSession(requestid, retObj.getBytes());
	}

	/**
	 * ����ID
	 *
	 * @return
	 */
	public Optional<Integer> getRequestId(Class clazz) {
		Integer reqId = null;
		try {
			reqId =clazz.getField("REQUEST_ID").getInt(null);
		} catch (IllegalAccessException e) {
			logger.error("get request id", e);
		} catch (NoSuchFieldException e) {
			logger.error("get request id", e);
		}
		return Optional.fromNullable(reqId);
	}


	/**
	 * �Ƿ��¼log
	 *
	 * @return
	 */
	public boolean isLog() {
		return true;
	}
}
