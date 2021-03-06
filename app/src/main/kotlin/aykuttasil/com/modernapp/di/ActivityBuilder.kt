/**
 * Designed and developed by Aykut Asil (@aykuttasil)
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
package aykuttasil.com.modernapp.di

import aykuttasil.com.modernapp.di.scopes.PerActivity
import aykuttasil.com.modernapp.ui.main.MainActivity
import aykuttasil.com.modernapp.ui.main.MainActivityModule
import aykuttasil.com.modernapp.ui.user.UserActivity
import aykuttasil.com.modernapp.ui.user.UserActivityModule
import aykuttasil.com.modernapp.util.ActivityForTest
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [FragmentBuilder::class])
abstract class ActivityBuilder {

  @PerActivity
  @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
  internal abstract fun bindMainActivity(): MainActivity

  @PerActivity
  @ContributesAndroidInjector(modules = [(UserActivityModule::class)])
  internal abstract fun bindUserActivity(): UserActivity

  @PerActivity
  @ContributesAndroidInjector
  internal abstract fun bindActivityForTest(): ActivityForTest
}
