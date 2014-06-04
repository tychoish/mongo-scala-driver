/**
 * Copyright (c) 2014 MongoDB, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * For questions and comments about this product, please see the project page at:
 *
 * https://github.com/mongodb/mongo-scala-driver
 */
package org.mongodb.scala.rxscala.admin

import org.mongodb.scala.core.admin.MongoCollectionAdminProvider
import org.mongodb.scala.rxscala.{MongoCollection, RequiredTypesAndTransformers}

/**
 * MongoCollectionAdmin
 *
 * @param collection the MongoCollection being administrated
 * @tparam T the type of collection
 */
case class MongoCollectionAdmin[T](collection: MongoCollection[T]) extends MongoCollectionAdminProvider[T]
  with RequiredTypesAndTransformers