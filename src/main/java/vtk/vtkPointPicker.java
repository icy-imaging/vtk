// java wrapper for vtkPointPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointPicker extends vtkPicker
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

  private native long GetPointId_4();
  public long GetPointId()
  {
    return GetPointId_4();
  }

  private native void SetUseCells_5(int id0);
  public void SetUseCells(int id0)
  {
    SetUseCells_5(id0);
  }

  private native int GetUseCells_6();
  public int GetUseCells()
  {
    return GetUseCells_6();
  }

  private native void UseCellsOn_7();
  public void UseCellsOn()
  {
    UseCellsOn_7();
  }

  private native void UseCellsOff_8();
  public void UseCellsOff()
  {
    UseCellsOff_8();
  }

  public vtkPointPicker() { super(); }

  public vtkPointPicker(long id) { super(id); }
  public native long   VTKInit();

}
