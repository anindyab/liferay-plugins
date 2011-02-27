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

package com.liferay.portal.workflow.kaleo.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the kaleo transition local service. This utility wraps {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoTransitionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransitionLocalService
 * @see com.liferay.portal.workflow.kaleo.service.base.KaleoTransitionLocalServiceBaseImpl
 * @see com.liferay.portal.workflow.kaleo.service.impl.KaleoTransitionLocalServiceImpl
 * @generated
 */
public class KaleoTransitionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoTransitionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the kaleo transition to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to add
	* @return the kaleo transition that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKaleoTransition(kaleoTransition);
	}

	/**
	* Creates a new kaleo transition with the primary key. Does not add the kaleo transition to the database.
	*
	* @param kaleoTransitionId the primary key for the new kaleo transition
	* @return the new kaleo transition
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition createKaleoTransition(
		long kaleoTransitionId) {
		return getService().createKaleoTransition(kaleoTransitionId);
	}

	/**
	* Deletes the kaleo transition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition to delete
	* @throws PortalException if a kaleo transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoTransition(long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoTransition(kaleoTransitionId);
	}

	/**
	* Deletes the kaleo transition from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoTransition(kaleoTransition);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the kaleo transition with the primary key.
	*
	* @param kaleoTransitionId the primary key of the kaleo transition to get
	* @return the kaleo transition
	* @throws PortalException if a kaleo transition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoTransitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransition(kaleoTransitionId);
	}

	/**
	* Gets a range of all the kaleo transitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo transitions to return
	* @param end the upper bound of the range of kaleo transitions to return (not inclusive)
	* @return the range of kaleo transitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransitions(start, end);
	}

	/**
	* Gets the number of kaleo transitions.
	*
	* @return the number of kaleo transitions
	* @throws SystemException if a system exception occurred
	*/
	public static int getKaleoTransitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransitionsCount();
	}

	/**
	* Updates the kaleo transition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to update
	* @return the kaleo transition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition updateKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKaleoTransition(kaleoTransition);
	}

	/**
	* Updates the kaleo transition in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTransition the kaleo transition to update
	* @param merge whether to merge the kaleo transition with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the kaleo transition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition updateKaleoTransition(
		com.liferay.portal.workflow.kaleo.model.KaleoTransition kaleoTransition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKaleoTransition(kaleoTransition, merge);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition addKaleoTransition(
		long kaleoDefinitionId, long kaleoNodeId,
		com.liferay.portal.workflow.kaleo.definition.Transition transition,
		com.liferay.portal.workflow.kaleo.model.KaleoNode sourceKaleoNode,
		com.liferay.portal.workflow.kaleo.model.KaleoNode targetKaleoNode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addKaleoTransition(kaleoDefinitionId, kaleoNodeId,
			transition, sourceKaleoNode, targetKaleoNode, serviceContext);
	}

	public static void deleteCompanyKaleoTransitions(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCompanyKaleoTransitions(companyId);
	}

	public static void deleteKaleoDefinitionKaleoTransitions(
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoDefinitionKaleoTransitions(kaleoDefinitionId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition getDefaultKaleoTransition(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDefaultKaleoTransition(kaleoNodeId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTransition getKaleoTransition(
		long kaleoNodeId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransition(kaleoNodeId, name);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTransition> getKaleoTransitions(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransitions(kaleoNodeId);
	}

	public static int getKaleoTransitionsCount(long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTransitionsCount(kaleoNodeId);
	}

	public static void clearService() {
		_service = null;
	}

	public static KaleoTransitionLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					KaleoTransitionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					KaleoTransitionLocalService.class.getName(),
					portletClassLoader);

			_service = new KaleoTransitionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(KaleoTransitionLocalServiceUtil.class,
				"_service");
			MethodCache.remove(KaleoTransitionLocalService.class);
		}

		return _service;
	}

	public void setService(KaleoTransitionLocalService service) {
		MethodCache.remove(KaleoTransitionLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(KaleoTransitionLocalServiceUtil.class,
			"_service");
		MethodCache.remove(KaleoTransitionLocalService.class);
	}

	private static KaleoTransitionLocalService _service;
}