// java wrapper for vtkVolumePicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumePicker extends vtkCellPicker
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

  private native void SetPickCroppingPlanes_4(int id0);
  public void SetPickCroppingPlanes(int id0)
  {
    SetPickCroppingPlanes_4(id0);
  }

  private native void PickCroppingPlanesOn_5();
  public void PickCroppingPlanesOn()
  {
    PickCroppingPlanesOn_5();
  }

  private native void PickCroppingPlanesOff_6();
  public void PickCroppingPlanesOff()
  {
    PickCroppingPlanesOff_6();
  }

  private native int GetPickCroppingPlanes_7();
  public int GetPickCroppingPlanes()
  {
    return GetPickCroppingPlanes_7();
  }

  private native int GetCroppingPlaneId_8();
  public int GetCroppingPlaneId()
  {
    return GetCroppingPlaneId_8();
  }

  public vtkVolumePicker() { super(); }

  public vtkVolumePicker(long id) { super(id); }
  public native long   VTKInit();

}
