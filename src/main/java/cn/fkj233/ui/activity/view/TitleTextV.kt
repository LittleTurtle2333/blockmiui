/*
 * BlockMIUI
 * Copyright (C) 2022 fkj@fkj233.cn
 * https://github.com/577fkj/BlockMIUI
 *
 * This software is free opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public License v2.1
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by 577fkj.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * GNU Lesser General Public License v2.1 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License v2.1
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/577fkj/BlockMIUI/blob/main/LICENSE>.
 */

package cn.fkj233.ui.activity.view

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import cn.fkj233.ui.activity.data.DataBinding

class TitleTextV(val text: String? = null, private val resId: Int? = null, private val dataBindingRecv: DataBinding.Binding.Recv? = null, private val onClickListener: (() -> Unit)? = null): BaseView() {

    override fun getType(): BaseView {
        return this
    }

    override fun create(context: Context, callBacks: (() -> Unit)?): View {
        return TextV(text, resId, 12f, onClickListener = onClickListener).create(context, callBacks).also {
            (it as TextView).setTextColor(Color.parseColor("#9399b3"))
            dataBindingRecv?.setView(it)
        }
    }

}