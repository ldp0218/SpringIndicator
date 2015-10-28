/*
 * Copyright 2015 chenupt
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

package github.chenupt.multiplemodel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import github.chenupt.multiplemodel.recycler.BaseRecyclerAdapter;

/**
 * Created by chenupt@gmail.com on 1/7/15.
 * Description : Interface new a model.
 *
 * Manager接口。负责给adapter管理model view。
 */
public interface IModelManager {

    public BaseItemModel createModel(Context context, String modelType);
    public RecyclerView.ViewHolder createModel(Context context, Class<?> owner, BaseRecyclerAdapter adapter);
    public BaseItemModel modelNewInstance(Context context, Class<?> owner) throws Exception;
    public int getViewType(String modelType);
    public int getViewTypeCount();
    public Class<?> getViewClass(int viewType);
    public boolean isItemViewTypePinned(int type);
}
