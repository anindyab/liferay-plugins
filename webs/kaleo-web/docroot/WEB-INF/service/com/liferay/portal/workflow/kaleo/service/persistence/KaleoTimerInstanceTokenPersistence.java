/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken;

/**
 * The persistence interface for the kaleo timer instance token service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimerInstanceTokenPersistenceImpl
 * @see KaleoTimerInstanceTokenUtil
 * @generated
 */
public interface KaleoTimerInstanceTokenPersistence extends BasePersistence<KaleoTimerInstanceToken> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KaleoTimerInstanceTokenUtil} to access the kaleo timer instance token persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the kaleo timer instance token in the entity cache if it is enabled.
	*
	* @param kaleoTimerInstanceToken the kaleo timer instance token to cache
	*/
	public void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken);

	/**
	* Caches the kaleo timer instance tokens in the entity cache if it is enabled.
	*
	* @param kaleoTimerInstanceTokens the kaleo timer instance tokens to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> kaleoTimerInstanceTokens);

	/**
	* Creates a new kaleo timer instance token with the primary key. Does not add the kaleo timer instance token to the database.
	*
	* @param kaleoTimerInstanceTokenId the primary key for the new kaleo timer instance token
	* @return the new kaleo timer instance token
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken create(
		long kaleoTimerInstanceTokenId);

	/**
	* Removes the kaleo timer instance token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceTokenId the primary key of the kaleo timer instance token to remove
	* @return the kaleo timer instance token that was removed
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken remove(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the kaleo timer instance token with the primary key or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException} if it could not be found.
	*
	* @param kaleoTimerInstanceTokenId the primary key of the kaleo timer instance token to find
	* @return the kaleo timer instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken findByPrimaryKey(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Finds the kaleo timer instance token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kaleoTimerInstanceTokenId the primary key of the kaleo timer instance token to find
	* @return the kaleo timer instance token, or <code>null</code> if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken fetchByPrimaryKey(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the kaleo timer instance tokens where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @return the matching kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo timer instance tokens where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param start the lower bound of the range of kaleo timer instance tokens to return
	* @param end the upper bound of the range of kaleo timer instance tokens to return (not inclusive)
	* @return the range of matching kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo timer instance tokens where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param start the lower bound of the range of kaleo timer instance tokens to return
	* @param end the upper bound of the range of kaleo timer instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first kaleo timer instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kaleo timer instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a matching kaleo timer instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken findByKaleoInstanceId_First(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Finds the last kaleo timer instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kaleo timer instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a matching kaleo timer instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken findByKaleoInstanceId_Last(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Finds the kaleo timer instance tokens before and after the current kaleo timer instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTimerInstanceTokenId the primary key of the current kaleo timer instance token
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kaleo timer instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken[] findByKaleoInstanceId_PrevAndNext(
		long kaleoTimerInstanceTokenId, long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Finds the kaleo timer instance token where kaleoInstanceId = &#63; and kaleoTimerId = &#63; or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException} if it could not be found.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param kaleoTimerId the kaleo timer ID to search with
	* @return the matching kaleo timer instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException if a matching kaleo timer instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken findByKII_KTI(
		long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Finds the kaleo timer instance token where kaleoInstanceId = &#63; and kaleoTimerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param kaleoTimerId the kaleo timer ID to search with
	* @return the matching kaleo timer instance token, or <code>null</code> if a matching kaleo timer instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken fetchByKII_KTI(
		long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the kaleo timer instance token where kaleoInstanceId = &#63; and kaleoTimerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param kaleoTimerId the kaleo timer ID to search with
	* @return the matching kaleo timer instance token, or <code>null</code> if a matching kaleo timer instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken fetchByKII_KTI(
		long kaleoInstanceId, long kaleoTimerId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the kaleo timer instance tokens.
	*
	* @return the kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the kaleo timer instance tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo timer instance tokens to return
	* @param end the upper bound of the range of kaleo timer instance tokens to return (not inclusive)
	* @return the range of kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the kaleo timer instance tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo timer instance tokens to return
	* @param end the upper bound of the range of kaleo timer instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the kaleo timer instance tokens where kaleoInstanceId = &#63; from the database.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the kaleo timer instance token where kaleoInstanceId = &#63; and kaleoTimerId = &#63; from the database.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param kaleoTimerId the kaleo timer ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByKII_KTI(long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTimerInstanceTokenException;

	/**
	* Removes all the kaleo timer instance tokens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo timer instance tokens where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @return the number of matching kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public int countByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo timer instance tokens where kaleoInstanceId = &#63; and kaleoTimerId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance ID to search with
	* @param kaleoTimerId the kaleo timer ID to search with
	* @return the number of matching kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public int countByKII_KTI(long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the kaleo timer instance tokens.
	*
	* @return the number of kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public KaleoTimerInstanceToken remove(
		KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws SystemException;
}