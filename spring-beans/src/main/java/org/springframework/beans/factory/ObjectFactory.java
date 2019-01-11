/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory;

import org.springframework.beans.BeansException;


/**
 * 定义可以在调用时返回对象实例(可能是共享的或独立的)的工厂。
 <p>这个接口通常用于封装一个通用工厂，该工厂在每次调用中返回一些目标对象的新实例(原型)。
 <p>这个接口类似于{@link FactoryBean}，但是后者的实现通常被定义为{@link BeanFactory}中的SPI实例，而这个类的实现通常是作为其他bean(通过注入)的API来提供的。因此，{@code getObject()}方法有不同的异常处理行为。
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * <p>This interface is typically used to encapsulate a generic factory which
 * returns a new instance (prototype) of some target object on each invocation.
 *
 * <p>This interface is similar to {@link FactoryBean}, but implementations
 * of the latter are normally meant to be defined as SPI instances in a
 * {@link BeanFactory}, while implementations of this class are normally meant
 * to be fed as an API to other beans (through injection). As such, the
 * {@code getObject()} method has different exception handling behavior.
 *
 * @author Colin Sampaleanu
 * @since 1.0.2
 * @see FactoryBean
 */
public interface ObjectFactory<T> {

	/**
	 * Return an instance (possibly shared or independent)
	 * of the object managed by this factory.
	 * @return an instance of the bean (should never be {@code null})
	 * @throws BeansException in case of creation errors
	 */
	T getObject() throws BeansException;

}
