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
package aykuttasil.com.modernapp.ui.user

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import aykuttasil.com.modernapp.R
import aykuttasil.com.modernapp.databinding.ActivityUserBinding
import aykuttasil.com.modernapp.di.ViewModelFactory
import aykuttasil.com.modernapp.ui.common.BaseActivity
import aykuttasil.com.modernapp.util.delegates.contentView
import com.aykutasil.modernapp.util.logd
import javax.inject.Inject

class UserActivity : BaseActivity() {

  private val binding: ActivityUserBinding by contentView(R.layout.activity_user)

  @Inject
  lateinit var viewModelFactory: ViewModelFactory

  private lateinit var viewModel: UserViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    logd { "onCreate" }
    viewModel = ViewModelProviders.of(this@UserActivity, viewModelFactory).get(UserViewModel::class.java)
  }
}
