#手势锁 GestureLockView

        ##手势锁属性
         #####          <!-- 点半径比例（取值范围[0F,1F]） -->
        #####          <attr name="radius_ratio" format="float" />
         #####          <!-- 线厚度（粗细值） -->
        #####          <attr name="line_thickness" format="dimension" />
        #####          <!-- 正常状态画笔颜色 -->
        #####          <attr name="normal_color" format="color|reference" />
        #####          <!-- 按下状态画笔颜色 -->
        #####          <attr name="press_color" format="color|reference" />
        #####          <!-- 出错状态画笔颜色 -->
        #####          <attr name="error_color" format="color|reference" />
        #####          <!-- 是否显示辅助线 -->
        #####          <attr name="is_show_guides" format="boolean" />
        #####          <!-- 连线是否绘制在顶部 -->
        #####          <attr name="is_line_top" format="boolean" />
        #####          <!-- 是否使用动画 -->
        #####          <attr name="is_use_animation" format="boolean" />
        #####          <!-- 动画时长 -->
        #####          <attr name="animation_duration" format="integer" />
        #####          <!-- 动画缩放类型 -->
        #####          <attr name="animation_scale_mode">
            #####          <enum name="normal" value="0" />          <!-- 正常缩放 -->
            #####          <enum name="reverse" value="1" />         <!-- 反转缩放 -->
        #####          </attr>
        #####          <!-- 动画缩放比例 -->
        #####          <attr name="animation_scale_rate" format="float" />
        #####          <!-- 是否使用震动 -->
        #####          <attr name="is_use_vibrate" format="boolean" />
        #####          <!-- 震动时长 -->
        #####          <attr name="vibrate_duration" format="integer" />
        #####          <!-- 正常状态点图片 -->
        #####          <attr name="normal_image" format="reference" />
        #####          <!-- 按下状态点图片 -->
        #####          <attr name="press_image" format="reference" />
        #####          <!-- 出错状态点图片 -->
        #####          <attr name="error_image" format="reference" />
    #####          </declare-styleable>

    #####          <!-- 手势解锁缩略图自定义属性 -->
    #####          <declare-styleable name="GestureLockThumbnailView">
        #####          <!-- 点半径比例（取值范围[0F,1F]） -->
        #####          <attr name="thumbnail_ratio" format="float" />
        #####          <!-- 缩略图颜色 -->
        #####          <attr name="thumbnail_color" format="color|reference" />
    #####          </declare-styleable>
