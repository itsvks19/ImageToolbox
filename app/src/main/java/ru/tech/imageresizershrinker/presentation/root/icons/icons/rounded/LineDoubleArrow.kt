package ru.tech.imageresizershrinker.presentation.root.icons.icons.rounded

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Icons.Rounded.LineDoubleArrow: ImageVector by lazy {
    Builder(
        name = "LineDoubleArrow", defaultWidth = 24.0.dp, defaultHeight =
        24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f
    ).apply {
        path(
            fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
            pathFillType = NonZero
        ) {
            moveTo(160.0f, 840.0f)
            quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
            reflectiveQuadTo(120.0f, 800.0f)
            verticalLineToRelative(-240.0f)
            quadToRelative(0.0f, -17.0f, 11.5f, -28.5f)
            reflectiveQuadTo(160.0f, 520.0f)
            quadToRelative(17.0f, 0.0f, 28.5f, 11.5f)
            reflectiveQuadTo(200.0f, 560.0f)
            verticalLineToRelative(144.0f)
            lineToRelative(504.0f, -504.0f)
            lineTo(560.0f, 200.0f)
            quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
            reflectiveQuadTo(520.0f, 160.0f)
            quadToRelative(0.0f, -17.0f, 11.5f, -28.5f)
            reflectiveQuadTo(560.0f, 120.0f)
            horizontalLineToRelative(240.0f)
            quadToRelative(17.0f, 0.0f, 28.5f, 11.5f)
            reflectiveQuadTo(840.0f, 160.0f)
            verticalLineToRelative(240.0f)
            quadToRelative(0.0f, 17.0f, -11.5f, 28.5f)
            reflectiveQuadTo(800.0f, 440.0f)
            quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
            reflectiveQuadTo(760.0f, 400.0f)
            verticalLineToRelative(-144.0f)
            lineTo(256.0f, 760.0f)
            horizontalLineToRelative(144.0f)
            quadToRelative(17.0f, 0.0f, 28.5f, 11.5f)
            reflectiveQuadTo(440.0f, 800.0f)
            quadToRelative(0.0f, 17.0f, -11.5f, 28.5f)
            reflectiveQuadTo(400.0f, 840.0f)
            lineTo(160.0f, 840.0f)
            close()
        }
    }.build()
}