// java wrapper for vtkExodusIIWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExodusIIWriter extends vtkWriter
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

  private native void SetModelMetadata_4(vtkModelMetadata id0);
  public void SetModelMetadata(vtkModelMetadata id0)
  {
    SetModelMetadata_4(id0);
  }

  private native long GetModelMetadata_5();
  public vtkModelMetadata GetModelMetadata()
  {
    long temp = GetModelMetadata_5();

    if (temp == 0) return null;
    return (vtkModelMetadata)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetStoreDoubles_8(int id0);
  public void SetStoreDoubles(int id0)
  {
    SetStoreDoubles_8(id0);
  }

  private native int GetStoreDoubles_9();
  public int GetStoreDoubles()
  {
    return GetStoreDoubles_9();
  }

  private native void SetGhostLevel_10(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_10(id0);
  }

  private native int GetGhostLevel_11();
  public int GetGhostLevel()
  {
    return GetGhostLevel_11();
  }

  private native void SetWriteOutBlockIdArray_12(int id0);
  public void SetWriteOutBlockIdArray(int id0)
  {
    SetWriteOutBlockIdArray_12(id0);
  }

  private native int GetWriteOutBlockIdArray_13();
  public int GetWriteOutBlockIdArray()
  {
    return GetWriteOutBlockIdArray_13();
  }

  private native void WriteOutBlockIdArrayOn_14();
  public void WriteOutBlockIdArrayOn()
  {
    WriteOutBlockIdArrayOn_14();
  }

  private native void WriteOutBlockIdArrayOff_15();
  public void WriteOutBlockIdArrayOff()
  {
    WriteOutBlockIdArrayOff_15();
  }

  private native void SetWriteOutGlobalNodeIdArray_16(int id0);
  public void SetWriteOutGlobalNodeIdArray(int id0)
  {
    SetWriteOutGlobalNodeIdArray_16(id0);
  }

  private native int GetWriteOutGlobalNodeIdArray_17();
  public int GetWriteOutGlobalNodeIdArray()
  {
    return GetWriteOutGlobalNodeIdArray_17();
  }

  private native void WriteOutGlobalNodeIdArrayOn_18();
  public void WriteOutGlobalNodeIdArrayOn()
  {
    WriteOutGlobalNodeIdArrayOn_18();
  }

  private native void WriteOutGlobalNodeIdArrayOff_19();
  public void WriteOutGlobalNodeIdArrayOff()
  {
    WriteOutGlobalNodeIdArrayOff_19();
  }

  private native void SetWriteOutGlobalElementIdArray_20(int id0);
  public void SetWriteOutGlobalElementIdArray(int id0)
  {
    SetWriteOutGlobalElementIdArray_20(id0);
  }

  private native int GetWriteOutGlobalElementIdArray_21();
  public int GetWriteOutGlobalElementIdArray()
  {
    return GetWriteOutGlobalElementIdArray_21();
  }

  private native void WriteOutGlobalElementIdArrayOn_22();
  public void WriteOutGlobalElementIdArrayOn()
  {
    WriteOutGlobalElementIdArrayOn_22();
  }

  private native void WriteOutGlobalElementIdArrayOff_23();
  public void WriteOutGlobalElementIdArrayOff()
  {
    WriteOutGlobalElementIdArrayOff_23();
  }

  private native void SetWriteAllTimeSteps_24(int id0);
  public void SetWriteAllTimeSteps(int id0)
  {
    SetWriteAllTimeSteps_24(id0);
  }

  private native int GetWriteAllTimeSteps_25();
  public int GetWriteAllTimeSteps()
  {
    return GetWriteAllTimeSteps_25();
  }

  private native void WriteAllTimeStepsOn_26();
  public void WriteAllTimeStepsOn()
  {
    WriteAllTimeStepsOn_26();
  }

  private native void WriteAllTimeStepsOff_27();
  public void WriteAllTimeStepsOff()
  {
    WriteAllTimeStepsOff_27();
  }

  private native void SetBlockIdArrayName_28(byte[] id0, int len0);
  public void SetBlockIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBlockIdArrayName_28(bytes0, bytes0.length);
  }

  private native byte[] GetBlockIdArrayName_29();
  public String GetBlockIdArrayName()
  {
    return new String(GetBlockIdArrayName_29(), StandardCharsets.UTF_8);
  }

  private native void SetIgnoreMetaDataWarning_30(boolean id0);
  public void SetIgnoreMetaDataWarning(boolean id0)
  {
    SetIgnoreMetaDataWarning_30(id0);
  }

  private native boolean GetIgnoreMetaDataWarning_31();
  public boolean GetIgnoreMetaDataWarning()
  {
    return GetIgnoreMetaDataWarning_31();
  }

  private native void IgnoreMetaDataWarningOn_32();
  public void IgnoreMetaDataWarningOn()
  {
    IgnoreMetaDataWarningOn_32();
  }

  private native void IgnoreMetaDataWarningOff_33();
  public void IgnoreMetaDataWarningOff()
  {
    IgnoreMetaDataWarningOff_33();
  }

  public vtkExodusIIWriter() { super(); }

  public vtkExodusIIWriter(long id) { super(id); }
  public native long   VTKInit();

}
