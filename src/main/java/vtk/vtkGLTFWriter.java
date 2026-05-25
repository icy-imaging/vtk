// java wrapper for vtkGLTFWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLTFWriter extends vtkWriter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetTextureBaseDirectory_6(byte[] id0, int len0);
  public void SetTextureBaseDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureBaseDirectory_6(bytes0, bytes0.length);
  }

  private native byte[] GetTextureBaseDirectory_7();
  public String GetTextureBaseDirectory()
  {
    return new String(GetTextureBaseDirectory_7(), StandardCharsets.UTF_8);
  }

  private native void SetPropertyTextureFile_8(byte[] id0, int len0);
  public void SetPropertyTextureFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPropertyTextureFile_8(bytes0, bytes0.length);
  }

  private native byte[] GetPropertyTextureFile_9();
  public String GetPropertyTextureFile()
  {
    return new String(GetPropertyTextureFile_9(), StandardCharsets.UTF_8);
  }

  private native boolean GetInlineData_10();
  public boolean GetInlineData()
  {
    return GetInlineData_10();
  }

  private native void SetInlineData_11(boolean id0);
  public void SetInlineData(boolean id0)
  {
    SetInlineData_11(id0);
  }

  private native void InlineDataOn_12();
  public void InlineDataOn()
  {
    InlineDataOn_12();
  }

  private native void InlineDataOff_13();
  public void InlineDataOff()
  {
    InlineDataOff_13();
  }

  private native boolean GetSaveNormal_14();
  public boolean GetSaveNormal()
  {
    return GetSaveNormal_14();
  }

  private native void SetSaveNormal_15(boolean id0);
  public void SetSaveNormal(boolean id0)
  {
    SetSaveNormal_15(id0);
  }

  private native void SaveNormalOn_16();
  public void SaveNormalOn()
  {
    SaveNormalOn_16();
  }

  private native void SaveNormalOff_17();
  public void SaveNormalOff()
  {
    SaveNormalOff_17();
  }

  private native boolean GetSaveBatchId_18();
  public boolean GetSaveBatchId()
  {
    return GetSaveBatchId_18();
  }

  private native void SetSaveBatchId_19(boolean id0);
  public void SetSaveBatchId(boolean id0)
  {
    SetSaveBatchId_19(id0);
  }

  private native void SaveBatchIdOn_20();
  public void SaveBatchIdOn()
  {
    SaveBatchIdOn_20();
  }

  private native void SaveBatchIdOff_21();
  public void SaveBatchIdOff()
  {
    SaveBatchIdOff_21();
  }

  private native boolean GetSaveTextures_22();
  public boolean GetSaveTextures()
  {
    return GetSaveTextures_22();
  }

  private native void SetSaveTextures_23(boolean id0);
  public void SetSaveTextures(boolean id0)
  {
    SetSaveTextures_23(id0);
  }

  private native void SaveTexturesOn_24();
  public void SaveTexturesOn()
  {
    SaveTexturesOn_24();
  }

  private native void SaveTexturesOff_25();
  public void SaveTexturesOff()
  {
    SaveTexturesOff_25();
  }

  private native boolean GetCopyTextures_26();
  public boolean GetCopyTextures()
  {
    return GetCopyTextures_26();
  }

  private native void SetCopyTextures_27(boolean id0);
  public void SetCopyTextures(boolean id0)
  {
    SetCopyTextures_27(id0);
  }

  private native void CopyTexturesOn_28();
  public void CopyTexturesOn()
  {
    CopyTexturesOn_28();
  }

  private native void CopyTexturesOff_29();
  public void CopyTexturesOff()
  {
    CopyTexturesOff_29();
  }

  private native boolean GetSaveActivePointColor_30();
  public boolean GetSaveActivePointColor()
  {
    return GetSaveActivePointColor_30();
  }

  private native void SetSaveActivePointColor_31(boolean id0);
  public void SetSaveActivePointColor(boolean id0)
  {
    SetSaveActivePointColor_31(id0);
  }

  private native void SaveActivePointColorOn_32();
  public void SaveActivePointColorOn()
  {
    SaveActivePointColorOn_32();
  }

  private native void SaveActivePointColorOff_33();
  public void SaveActivePointColorOff()
  {
    SaveActivePointColorOff_33();
  }

  private native boolean GetRelativeCoordinates_34();
  public boolean GetRelativeCoordinates()
  {
    return GetRelativeCoordinates_34();
  }

  private native void SetRelativeCoordinates_35(boolean id0);
  public void SetRelativeCoordinates(boolean id0)
  {
    SetRelativeCoordinates_35(id0);
  }

  private native void RelativeCoordinatesOn_36();
  public void RelativeCoordinatesOn()
  {
    RelativeCoordinatesOn_36();
  }

  private native void RelativeCoordinatesOff_37();
  public void RelativeCoordinatesOff()
  {
    RelativeCoordinatesOff_37();
  }

  private native boolean GetBinary_38();
  public boolean GetBinary()
  {
    return GetBinary_38();
  }

  private native byte[] WriteToString_39();
  public String WriteToString()
  {
    return new String(WriteToString_39(), StandardCharsets.UTF_8);
  }

  public vtkGLTFWriter() { super(); }

  public vtkGLTFWriter(long id) { super(id); }
  public native long   VTKInit();

}
