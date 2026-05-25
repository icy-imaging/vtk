// java wrapper for vtkGL2PSExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGL2PSExporter extends vtkExporter
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetFilePrefix_4(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_4(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_5();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_5(), StandardCharsets.UTF_8);
  }

  private native void SetBufferSize_6(int id0);
  public void SetBufferSize(int id0)
  {
    SetBufferSize_6(id0);
  }

  private native int GetBufferSize_7();
  public int GetBufferSize()
  {
    return GetBufferSize_7();
  }

  private native void SetTitle_8(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_8(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_9();
  public String GetTitle()
  {
    return new String(GetTitle_9(), StandardCharsets.UTF_8);
  }

  private native void UsePainterSettings_10();
  public void UsePainterSettings()
  {
    UsePainterSettings_10();
  }

  private native void SetFileFormat_11(int id0);
  public void SetFileFormat(int id0)
  {
    SetFileFormat_11(id0);
  }

  private native int GetFileFormatMinValue_12();
  public int GetFileFormatMinValue()
  {
    return GetFileFormatMinValue_12();
  }

  private native int GetFileFormatMaxValue_13();
  public int GetFileFormatMaxValue()
  {
    return GetFileFormatMaxValue_13();
  }

  private native int GetFileFormat_14();
  public int GetFileFormat()
  {
    return GetFileFormat_14();
  }

  private native void SetFileFormatToPS_15();
  public void SetFileFormatToPS()
  {
    SetFileFormatToPS_15();
  }

  private native void SetFileFormatToEPS_16();
  public void SetFileFormatToEPS()
  {
    SetFileFormatToEPS_16();
  }

  private native void SetFileFormatToPDF_17();
  public void SetFileFormatToPDF()
  {
    SetFileFormatToPDF_17();
  }

  private native void SetFileFormatToTeX_18();
  public void SetFileFormatToTeX()
  {
    SetFileFormatToTeX_18();
  }

  private native void SetFileFormatToSVG_19();
  public void SetFileFormatToSVG()
  {
    SetFileFormatToSVG_19();
  }

  private native byte[] GetFileFormatAsString_20();
  public String GetFileFormatAsString()
  {
    return new String(GetFileFormatAsString_20(), StandardCharsets.UTF_8);
  }

  private native void SetSort_21(int id0);
  public void SetSort(int id0)
  {
    SetSort_21(id0);
  }

  private native int GetSortMinValue_22();
  public int GetSortMinValue()
  {
    return GetSortMinValue_22();
  }

  private native int GetSortMaxValue_23();
  public int GetSortMaxValue()
  {
    return GetSortMaxValue_23();
  }

  private native int GetSort_24();
  public int GetSort()
  {
    return GetSort_24();
  }

  private native void SetSortToOff_25();
  public void SetSortToOff()
  {
    SetSortToOff_25();
  }

  private native void SetSortToSimple_26();
  public void SetSortToSimple()
  {
    SetSortToSimple_26();
  }

  private native void SetSortToBSP_27();
  public void SetSortToBSP()
  {
    SetSortToBSP_27();
  }

  private native byte[] GetSortAsString_28();
  public String GetSortAsString()
  {
    return new String(GetSortAsString_28(), StandardCharsets.UTF_8);
  }

  private native void SetCompress_29(int id0);
  public void SetCompress(int id0)
  {
    SetCompress_29(id0);
  }

  private native int GetCompress_30();
  public int GetCompress()
  {
    return GetCompress_30();
  }

  private native void CompressOn_31();
  public void CompressOn()
  {
    CompressOn_31();
  }

  private native void CompressOff_32();
  public void CompressOff()
  {
    CompressOff_32();
  }

  private native void SetDrawBackground_33(int id0);
  public void SetDrawBackground(int id0)
  {
    SetDrawBackground_33(id0);
  }

  private native int GetDrawBackground_34();
  public int GetDrawBackground()
  {
    return GetDrawBackground_34();
  }

  private native void DrawBackgroundOn_35();
  public void DrawBackgroundOn()
  {
    DrawBackgroundOn_35();
  }

  private native void DrawBackgroundOff_36();
  public void DrawBackgroundOff()
  {
    DrawBackgroundOff_36();
  }

  private native void SetSimpleLineOffset_37(int id0);
  public void SetSimpleLineOffset(int id0)
  {
    SetSimpleLineOffset_37(id0);
  }

  private native int GetSimpleLineOffset_38();
  public int GetSimpleLineOffset()
  {
    return GetSimpleLineOffset_38();
  }

  private native void SimpleLineOffsetOn_39();
  public void SimpleLineOffsetOn()
  {
    SimpleLineOffsetOn_39();
  }

  private native void SimpleLineOffsetOff_40();
  public void SimpleLineOffsetOff()
  {
    SimpleLineOffsetOff_40();
  }

  private native void SetSilent_41(int id0);
  public void SetSilent(int id0)
  {
    SetSilent_41(id0);
  }

  private native int GetSilent_42();
  public int GetSilent()
  {
    return GetSilent_42();
  }

  private native void SilentOn_43();
  public void SilentOn()
  {
    SilentOn_43();
  }

  private native void SilentOff_44();
  public void SilentOff()
  {
    SilentOff_44();
  }

  private native void SetBestRoot_45(int id0);
  public void SetBestRoot(int id0)
  {
    SetBestRoot_45(id0);
  }

  private native int GetBestRoot_46();
  public int GetBestRoot()
  {
    return GetBestRoot_46();
  }

  private native void BestRootOn_47();
  public void BestRootOn()
  {
    BestRootOn_47();
  }

  private native void BestRootOff_48();
  public void BestRootOff()
  {
    BestRootOff_48();
  }

  private native void SetText_49(int id0);
  public void SetText(int id0)
  {
    SetText_49(id0);
  }

  private native int GetText_50();
  public int GetText()
  {
    return GetText_50();
  }

  private native void TextOn_51();
  public void TextOn()
  {
    TextOn_51();
  }

  private native void TextOff_52();
  public void TextOff()
  {
    TextOff_52();
  }

  private native void SetLandscape_53(int id0);
  public void SetLandscape(int id0)
  {
    SetLandscape_53(id0);
  }

  private native int GetLandscape_54();
  public int GetLandscape()
  {
    return GetLandscape_54();
  }

  private native void LandscapeOn_55();
  public void LandscapeOn()
  {
    LandscapeOn_55();
  }

  private native void LandscapeOff_56();
  public void LandscapeOff()
  {
    LandscapeOff_56();
  }

  private native void SetPS3Shading_57(int id0);
  public void SetPS3Shading(int id0)
  {
    SetPS3Shading_57(id0);
  }

  private native int GetPS3Shading_58();
  public int GetPS3Shading()
  {
    return GetPS3Shading_58();
  }

  private native void PS3ShadingOn_59();
  public void PS3ShadingOn()
  {
    PS3ShadingOn_59();
  }

  private native void PS3ShadingOff_60();
  public void PS3ShadingOff()
  {
    PS3ShadingOff_60();
  }

  private native void SetOcclusionCull_61(int id0);
  public void SetOcclusionCull(int id0)
  {
    SetOcclusionCull_61(id0);
  }

  private native int GetOcclusionCull_62();
  public int GetOcclusionCull()
  {
    return GetOcclusionCull_62();
  }

  private native void OcclusionCullOn_63();
  public void OcclusionCullOn()
  {
    OcclusionCullOn_63();
  }

  private native void OcclusionCullOff_64();
  public void OcclusionCullOff()
  {
    OcclusionCullOff_64();
  }

  private native void SetWrite3DPropsAsRasterImage_65(int id0);
  public void SetWrite3DPropsAsRasterImage(int id0)
  {
    SetWrite3DPropsAsRasterImage_65(id0);
  }

  private native int GetWrite3DPropsAsRasterImage_66();
  public int GetWrite3DPropsAsRasterImage()
  {
    return GetWrite3DPropsAsRasterImage_66();
  }

  private native void Write3DPropsAsRasterImageOn_67();
  public void Write3DPropsAsRasterImageOn()
  {
    Write3DPropsAsRasterImageOn_67();
  }

  private native void Write3DPropsAsRasterImageOff_68();
  public void Write3DPropsAsRasterImageOff()
  {
    Write3DPropsAsRasterImageOff_68();
  }

  private native void SetTextAsPath_69(boolean id0);
  public void SetTextAsPath(boolean id0)
  {
    SetTextAsPath_69(id0);
  }

  private native boolean GetTextAsPath_70();
  public boolean GetTextAsPath()
  {
    return GetTextAsPath_70();
  }

  private native void TextAsPathOn_71();
  public void TextAsPathOn()
  {
    TextAsPathOn_71();
  }

  private native void TextAsPathOff_72();
  public void TextAsPathOff()
  {
    TextAsPathOff_72();
  }

  private native void SetRasterExclusions_73(vtkPropCollection id0);
  public void SetRasterExclusions(vtkPropCollection id0)
  {
    SetRasterExclusions_73(id0);
  }

  private native long GetRasterExclusions_74();
  public vtkPropCollection GetRasterExclusions()
  {
    long temp = GetRasterExclusions_74();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointSizeFactor_75(float id0);
  public void SetPointSizeFactor(float id0)
  {
    SetPointSizeFactor_75(id0);
  }

  private native float GetPointSizeFactor_76();
  public float GetPointSizeFactor()
  {
    return GetPointSizeFactor_76();
  }

  private native void SetLineWidthFactor_77(float id0);
  public void SetLineWidthFactor(float id0)
  {
    SetLineWidthFactor_77(id0);
  }

  private native float GetLineWidthFactor_78();
  public float GetLineWidthFactor()
  {
    return GetLineWidthFactor_78();
  }

  public vtkGL2PSExporter() { super(); }

  public vtkGL2PSExporter(long id) { super(id); }
  public native long   VTKInit();

}
