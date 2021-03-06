/*
 * Copyright 2012-2014 Continuuity, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.continuuity.tephra.distributed;

import org.apache.hadoop.conf.Configuration;

/**
 * A retry strategy provider is used by the tx client to get a new retry strategy for every call.
 */
public interface RetryStrategyProvider {

  /**
   * Provides a new instance of a retry strategy.
   * @return a retry strategy
   */
  RetryStrategy newRetryStrategy();

  /**
   * Configure the strategy.
   * @param config the configuration
   */
  void configure(Configuration config);

}
