/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2021 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.gradle.crowdin.internal;

import com.crowdin.client.sourcefiles.model.Directory;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.zaproxy.gradle.crowdin.internal.local.LocalFile;
import org.zaproxy.gradle.crowdin.internal.remote.RemoteItem;

public interface ApiClient {

    Directory createDirectory(long projectId, Long parentId, String name);

    FileInfo createFile(long projectId, Long parentId, LocalFile localFile);

    FileInfo updateFile(long projectId, long fileId, LocalFile localFile);

    void removeItem(long projectId, RemoteItem item);
}