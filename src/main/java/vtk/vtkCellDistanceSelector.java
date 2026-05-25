// java wrapper for vtkCellDistanceSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellDistanceSelector extends vtkSelectionAlgorithm
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

  private native void SetInputMeshConnection_4(vtkAlgorithmOutput id0);
  public void SetInputMeshConnection(vtkAlgorithmOutput id0)
  {
    SetInputMeshConnection_4(id0);
  }

  private native void SetInputMesh_5(vtkDataObject id0);
  public void SetInputMesh(vtkDataObject id0)
  {
    SetInputMesh_5(id0);
  }

  private native void SetInputSelectionConnection_6(vtkAlgorithmOutput id0);
  public void SetInputSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetInputSelectionConnection_6(id0);
  }

  private native void SetInputSelection_7(vtkSelection id0);
  public void SetInputSelection(vtkSelection id0)
  {
    SetInputSelection_7(id0);
  }

  private native void SetDistance_8(int id0);
  public void SetDistance(int id0)
  {
    SetDistance_8(id0);
  }

  private native int GetDistance_9();
  public int GetDistance()
  {
    return GetDistance_9();
  }

  private native void SetIncludeSeed_10(int id0);
  public void SetIncludeSeed(int id0)
  {
    SetIncludeSeed_10(id0);
  }

  private native int GetIncludeSeed_11();
  public int GetIncludeSeed()
  {
    return GetIncludeSeed_11();
  }

  private native void IncludeSeedOn_12();
  public void IncludeSeedOn()
  {
    IncludeSeedOn_12();
  }

  private native void IncludeSeedOff_13();
  public void IncludeSeedOff()
  {
    IncludeSeedOff_13();
  }

  private native void SetAddIntermediate_14(int id0);
  public void SetAddIntermediate(int id0)
  {
    SetAddIntermediate_14(id0);
  }

  private native int GetAddIntermediate_15();
  public int GetAddIntermediate()
  {
    return GetAddIntermediate_15();
  }

  private native void AddIntermediateOn_16();
  public void AddIntermediateOn()
  {
    AddIntermediateOn_16();
  }

  private native void AddIntermediateOff_17();
  public void AddIntermediateOff()
  {
    AddIntermediateOff_17();
  }

  public vtkCellDistanceSelector() { super(); }

  public vtkCellDistanceSelector(long id) { super(id); }
  public native long   VTKInit();

}
