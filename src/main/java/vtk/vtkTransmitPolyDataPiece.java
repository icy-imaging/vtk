// java wrapper for vtkTransmitPolyDataPiece object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransmitPolyDataPiece extends vtkPolyDataAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCreateGhostCells_6(int id0);
  public void SetCreateGhostCells(int id0)
  {
    SetCreateGhostCells_6(id0);
  }

  private native int GetCreateGhostCells_7();
  public int GetCreateGhostCells()
  {
    return GetCreateGhostCells_7();
  }

  private native void CreateGhostCellsOn_8();
  public void CreateGhostCellsOn()
  {
    CreateGhostCellsOn_8();
  }

  private native void CreateGhostCellsOff_9();
  public void CreateGhostCellsOff()
  {
    CreateGhostCellsOff_9();
  }

  public vtkTransmitPolyDataPiece() { super(); }

  public vtkTransmitPolyDataPiece(long id) { super(id); }
  public native long   VTKInit();

}
