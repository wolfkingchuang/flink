/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.client;

import org.apache.flink.util.FlinkException;

/**
 * Exception which is thrown by the {@link JobClientActor} if it has not heard back from the job
 * manager after it has submitted a job to it within a given timeout interval.
 */
public class JobClientActorSubmissionTimeoutException extends FlinkException {
	private static final long serialVersionUID = 8762463142030454853L;

	public JobClientActorSubmissionTimeoutException(String msg) {
		super(msg);
	}

	public JobClientActorSubmissionTimeoutException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
