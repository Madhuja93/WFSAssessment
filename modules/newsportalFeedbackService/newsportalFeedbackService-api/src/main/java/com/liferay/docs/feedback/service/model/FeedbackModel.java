/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.docs.feedback.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Feedback service. Represents a row in the &quot;FB_Feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.docs.feedback.service.model.impl.FeedbackModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.docs.feedback.service.model.impl.FeedbackImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Feedback
 * @generated
 */
@ProviderType
public interface FeedbackModel extends BaseModel<Feedback>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a feedback model instance should use the {@link Feedback} interface instead.
	 */

	/**
	 * Returns the primary key of this feedback.
	 *
	 * @return the primary key of this feedback
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this feedback.
	 *
	 * @param primaryKey the primary key of this feedback
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this feedback.
	 *
	 * @return the uuid of this feedback
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this feedback.
	 *
	 * @param uuid the uuid of this feedback
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the feedback ID of this feedback.
	 *
	 * @return the feedback ID of this feedback
	 */
	public long getFeedbackId();

	/**
	 * Sets the feedback ID of this feedback.
	 *
	 * @param feedbackId the feedback ID of this feedback
	 */
	public void setFeedbackId(long feedbackId);

	/**
	 * Returns the feedback date of this feedback.
	 *
	 * @return the feedback date of this feedback
	 */
	public Date getFeedbackDate();

	/**
	 * Sets the feedback date of this feedback.
	 *
	 * @param feedbackDate the feedback date of this feedback
	 */
	public void setFeedbackDate(Date feedbackDate);

	/**
	 * Returns the feedback text of this feedback.
	 *
	 * @return the feedback text of this feedback
	 */
	@AutoEscape
	public String getFeedbackText();

	/**
	 * Sets the feedback text of this feedback.
	 *
	 * @param feedbackText the feedback text of this feedback
	 */
	public void setFeedbackText(String feedbackText);

	/**
	 * Returns the feedback subject of this feedback.
	 *
	 * @return the feedback subject of this feedback
	 */
	@AutoEscape
	public String getFeedbackSubject();

	/**
	 * Sets the feedback subject of this feedback.
	 *
	 * @param feedbackSubject the feedback subject of this feedback
	 */
	public void setFeedbackSubject(String feedbackSubject);

	/**
	 * Returns the company ID of this feedback.
	 *
	 * @return the company ID of this feedback
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this feedback.
	 *
	 * @param companyId the company ID of this feedback
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this feedback.
	 *
	 * @return the group ID of this feedback
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this feedback.
	 *
	 * @param groupId the group ID of this feedback
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this feedback.
	 *
	 * @return the user ID of this feedback
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this feedback.
	 *
	 * @param userId the user ID of this feedback
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this feedback.
	 *
	 * @return the user uuid of this feedback
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this feedback.
	 *
	 * @param userUuid the user uuid of this feedback
	 */
	public void setUserUuid(String userUuid);

	@Override
	public Feedback cloneWithOriginalValues();

}