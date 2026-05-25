// java wrapper for vtkGLTFExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLTFExporter extends vtkExporter
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

  private native boolean GetInlineData_6();
  public boolean GetInlineData()
  {
    return GetInlineData_6();
  }

  private native void SetInlineData_7(boolean id0);
  public void SetInlineData(boolean id0)
  {
    SetInlineData_7(id0);
  }

  private native void InlineDataOn_8();
  public void InlineDataOn()
  {
    InlineDataOn_8();
  }

  private native void InlineDataOff_9();
  public void InlineDataOff()
  {
    InlineDataOff_9();
  }

  private native boolean GetSaveNormal_10();
  public boolean GetSaveNormal()
  {
    return GetSaveNormal_10();
  }

  private native void SetSaveNormal_11(boolean id0);
  public void SetSaveNormal(boolean id0)
  {
    SetSaveNormal_11(id0);
  }

  private native void SaveNormalOn_12();
  public void SaveNormalOn()
  {
    SaveNormalOn_12();
  }

  private native void SaveNormalOff_13();
  public void SaveNormalOff()
  {
    SaveNormalOff_13();
  }

  private native boolean GetSaveBatchId_14();
  public boolean GetSaveBatchId()
  {
    return GetSaveBatchId_14();
  }

  private native void SetSaveBatchId_15(boolean id0);
  public void SetSaveBatchId(boolean id0)
  {
    SetSaveBatchId_15(id0);
  }

  private native void SaveBatchIdOn_16();
  public void SaveBatchIdOn()
  {
    SaveBatchIdOn_16();
  }

  private native void SaveBatchIdOff_17();
  public void SaveBatchIdOff()
  {
    SaveBatchIdOff_17();
  }

  private native boolean GetSaveNaNValues_18();
  public boolean GetSaveNaNValues()
  {
    return GetSaveNaNValues_18();
  }

  private native void SetSaveNaNValues_19(boolean id0);
  public void SetSaveNaNValues(boolean id0)
  {
    SetSaveNaNValues_19(id0);
  }

  private native void SaveNaNValuesOn_20();
  public void SaveNaNValuesOn()
  {
    SaveNaNValuesOn_20();
  }

  private native void SaveNaNValuesOff_21();
  public void SaveNaNValuesOff()
  {
    SaveNaNValuesOff_21();
  }

  private native byte[] WriteToString_22();
  public String WriteToString()
  {
    return new String(WriteToString_22(), StandardCharsets.UTF_8);
  }

  public vtkGLTFExporter() { super(); }

  public vtkGLTFExporter(long id) { super(id); }
  public native long   VTKInit();

}
