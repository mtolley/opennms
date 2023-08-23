/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2018-2018 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2018 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.features.jest.client.bulk;

import java.io.IOException;
import java.util.Objects;

public class BulkException extends IOException {

    private static final String ERROR_MESSAGE = "Could not perform bulk operation";

    private BulkResultWrapper bulkResult;

    public BulkException(BulkResultWrapper bulkResultWrapper) {
        super(ERROR_MESSAGE);
        this.bulkResult = Objects.requireNonNull(bulkResultWrapper);
    }

    public BulkException() {
        super(ERROR_MESSAGE);
    }

    public BulkException(IOException ex) {
        super(ERROR_MESSAGE, ex);
    }

    public BulkResultWrapper getBulkResult() {
        return bulkResult;
    }
}
