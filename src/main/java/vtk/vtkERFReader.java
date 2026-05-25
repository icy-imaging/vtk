// java wrapper for vtkERFReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkERFReader extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native long GetStagesSelection_6();
  public vtkDataArraySelection GetStagesSelection()
  {
    long temp = GetStagesSelection_6();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVariablesSelection_7();
  public vtkDataArraySelection GetVariablesSelection()
  {
    long temp = GetVariablesSelection_7();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBlocksSelection_8();
  public vtkDataArraySelection GetBlocksSelection()
  {
    long temp = GetBlocksSelection_8();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void EnableAllVariables_9();
  public void EnableAllVariables()
  {
    EnableAllVariables_9();
  }

  private native void EnableAllBlocks_10();
  public void EnableAllBlocks()
  {
    EnableAllBlocks_10();
  }

  private native void SetVariablesStatus_11(byte[] id0, int len0,int id1);
  public void SetVariablesStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVariablesStatus_11(bytes0, bytes0.length,id1);
  }

  private native void SetStagesStatus_12(byte[] id0, int len0,int id1);
  public void SetStagesStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStagesStatus_12(bytes0, bytes0.length,id1);
  }

  private native void SetBlocksStatus_13(byte[] id0, int len0,int id1);
  public void SetBlocksStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBlocksStatus_13(bytes0, bytes0.length,id1);
  }

  private native byte[] GetStage_14();
  public String GetStage()
  {
    return new String(GetStage_14(), StandardCharsets.UTF_8);
  }

  public vtkERFReader() { super(); }

  public vtkERFReader(long id) { super(id); }
  public native long   VTKInit();

}
