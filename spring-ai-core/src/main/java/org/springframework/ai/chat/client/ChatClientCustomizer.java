/*
 * Copyright 2024-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.chat.client;

import org.springframework.ai.chat.ChatClient;

/**
 * Callback interface that can be used to customize a {@link ChatClient.Builder
 * ChatClient.Builder}.
 *
 * @author Christian Tzolov
 * @author Mark Pollack
 * @author Josh Long
 * @author Arjen Poutsma
 * @since 1.0.0 M1
 */
@FunctionalInterface
public interface ChatClientCustomizer {

	/**
	 * Callback to customize a {@link ChatClient.Builder ChatClient.Builder} instance.
	 * @param chatClientBuilder the client builder to customize
	 */
	void customize(ChatClient.Builder chatClientBuilder);

}
