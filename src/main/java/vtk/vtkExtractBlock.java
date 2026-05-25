// java wrapper for vtkExtractBlock object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractBlock extends vtkPassInputTypeAlgorithm
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

  private native void AddIndex_4(int id0);
  public void AddIndex(int id0)
  {
    AddIndex_4(id0);
  }

  private native void RemoveIndex_5(int id0);
  public void RemoveIndex(int id0)
  {
    RemoveIndex_5(id0);
  }

  private native void RemoveAllIndices_6();
  public void RemoveAllIndices()
  {
    RemoveAllIndices_6();
  }

  private native void SetPruneOutput_7(int id0);
  public void SetPruneOutput(int id0)
  {
    SetPruneOutput_7(id0);
  }

  private native int GetPruneOutput_8();
  public int GetPruneOutput()
  {
    return GetPruneOutput_8();
  }

  private native void PruneOutputOn_9();
  public void PruneOutputOn()
  {
    PruneOutputOn_9();
  }

  private native void PruneOutputOff_10();
  public void PruneOutputOff()
  {
    PruneOutputOff_10();
  }

  private native void SetMaintainStructure_11(int id0);
  public void SetMaintainStructure(int id0)
  {
    SetMaintainStructure_11(id0);
  }

  private native int GetMaintainStructure_12();
  public int GetMaintainStructure()
  {
    return GetMaintainStructure_12();
  }

  private native void MaintainStructureOn_13();
  public void MaintainStructureOn()
  {
    MaintainStructureOn_13();
  }

  private native void MaintainStructureOff_14();
  public void MaintainStructureOff()
  {
    MaintainStructureOff_14();
  }

  public vtkExtractBlock() { super(); }

  public vtkExtractBlock(long id) { super(id); }
  public native long   VTKInit();

}
