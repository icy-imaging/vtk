// java wrapper for vtkFreeTypeTools object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFreeTypeTools extends vtkObject
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

  private native long GetInstance_4();
  public vtkFreeTypeTools GetInstance()
  {
    long temp = GetInstance_4();

    if (temp == 0) return null;
    return (vtkFreeTypeTools)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInstance_5(vtkFreeTypeTools id0);
  public void SetInstance(vtkFreeTypeTools id0)
  {
    SetInstance_5(id0);
  }

  private native void SetDebugTextures_6(boolean id0);
  public void SetDebugTextures(boolean id0)
  {
    SetDebugTextures_6(id0);
  }

  private native boolean GetDebugTextures_7();
  public boolean GetDebugTextures()
  {
    return GetDebugTextures_7();
  }

  private native void DebugTexturesOn_8();
  public void DebugTexturesOn()
  {
    DebugTexturesOn_8();
  }

  private native void DebugTexturesOff_9();
  public void DebugTexturesOff()
  {
    DebugTexturesOff_9();
  }

  private native void SetMaximumNumberOfFaces_10(int id0);
  public void SetMaximumNumberOfFaces(int id0)
  {
    SetMaximumNumberOfFaces_10(id0);
  }

  private native int GetMaximumNumberOfFacesMinValue_11();
  public int GetMaximumNumberOfFacesMinValue()
  {
    return GetMaximumNumberOfFacesMinValue_11();
  }

  private native int GetMaximumNumberOfFacesMaxValue_12();
  public int GetMaximumNumberOfFacesMaxValue()
  {
    return GetMaximumNumberOfFacesMaxValue_12();
  }

  private native int GetMaximumNumberOfFaces_13();
  public int GetMaximumNumberOfFaces()
  {
    return GetMaximumNumberOfFaces_13();
  }

  private native void SetMaximumNumberOfSizes_14(int id0);
  public void SetMaximumNumberOfSizes(int id0)
  {
    SetMaximumNumberOfSizes_14(id0);
  }

  private native int GetMaximumNumberOfSizesMinValue_15();
  public int GetMaximumNumberOfSizesMinValue()
  {
    return GetMaximumNumberOfSizesMinValue_15();
  }

  private native int GetMaximumNumberOfSizesMaxValue_16();
  public int GetMaximumNumberOfSizesMaxValue()
  {
    return GetMaximumNumberOfSizesMaxValue_16();
  }

  private native int GetMaximumNumberOfSizes_17();
  public int GetMaximumNumberOfSizes()
  {
    return GetMaximumNumberOfSizes_17();
  }

  private native void SetMaximumNumberOfBytes_18(long id0);
  public void SetMaximumNumberOfBytes(long id0)
  {
    SetMaximumNumberOfBytes_18(id0);
  }

  private native long GetMaximumNumberOfBytesMinValue_19();
  public long GetMaximumNumberOfBytesMinValue()
  {
    return GetMaximumNumberOfBytesMinValue_19();
  }

  private native long GetMaximumNumberOfBytesMaxValue_20();
  public long GetMaximumNumberOfBytesMaxValue()
  {
    return GetMaximumNumberOfBytesMaxValue_20();
  }

  private native long GetMaximumNumberOfBytes_21();
  public long GetMaximumNumberOfBytes()
  {
    return GetMaximumNumberOfBytes_21();
  }

  private native boolean GetBoundingBox_22(vtkTextProperty id0,byte[] id1, int len1,int id2,int id3[]);
  public boolean GetBoundingBox(vtkTextProperty id0,String id1,int id2,int id3[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetBoundingBox_22(id0,bytes1, bytes1.length,id2,id3);
  }

  private native boolean RenderString_23(vtkTextProperty id0,byte[] id1, int len1,int id2,vtkImageData id3,int id4[]);
  public boolean RenderString(vtkTextProperty id0,String id1,int id2,vtkImageData id3,int id4[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return RenderString_23(id0,bytes1, bytes1.length,id2,id3,id4);
  }

  private native boolean StringToPath_24(vtkTextProperty id0,byte[] id1, int len1,int id2,vtkPath id3);
  public boolean StringToPath(vtkTextProperty id0,String id1,int id2,vtkPath id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return StringToPath_24(id0,bytes1, bytes1.length,id2,id3);
  }

  private native int GetConstrainedFontSize_25(byte[] id0, int len0,vtkTextProperty id1,int id2,int id3,int id4);
  public int GetConstrainedFontSize(String id0,vtkTextProperty id1,int id2,int id3,int id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetConstrainedFontSize_25(bytes0, bytes0.length,id1,id2,id3,id4);
  }

  private native short HashString_26(byte[] id0, int len0);
  public short HashString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return HashString_26(bytes0, bytes0.length);
  }

  private native void SetScaleToPowerTwo_27(boolean id0);
  public void SetScaleToPowerTwo(boolean id0)
  {
    SetScaleToPowerTwo_27(id0);
  }

  private native boolean GetScaleToPowerTwo_28();
  public boolean GetScaleToPowerTwo()
  {
    return GetScaleToPowerTwo_28();
  }

  private native void ScaleToPowerTwoOn_29();
  public void ScaleToPowerTwoOn()
  {
    ScaleToPowerTwoOn_29();
  }

  private native void ScaleToPowerTwoOff_30();
  public void ScaleToPowerTwoOff()
  {
    ScaleToPowerTwoOff_30();
  }

  private native void SetForceCompiledFonts_31(boolean id0);
  public void SetForceCompiledFonts(boolean id0)
  {
    SetForceCompiledFonts_31(id0);
  }

  private native boolean GetForceCompiledFonts_32();
  public boolean GetForceCompiledFonts()
  {
    return GetForceCompiledFonts_32();
  }

  private native void ForceCompiledFontsOn_33();
  public void ForceCompiledFontsOn()
  {
    ForceCompiledFontsOn_33();
  }

  private native void ForceCompiledFontsOff_34();
  public void ForceCompiledFontsOff()
  {
    ForceCompiledFontsOff_34();
  }

  public vtkFreeTypeTools() { super(); }

  public vtkFreeTypeTools(long id) { super(id); }

}
