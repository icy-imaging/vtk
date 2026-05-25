// java wrapper for vtkProcessIdScalars object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProcessIdScalars extends vtkDataSetAlgorithm
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

  private native void SetScalarModeToCellData_4();
  public void SetScalarModeToCellData()
  {
    SetScalarModeToCellData_4();
  }

  private native void SetScalarModeToPointData_5();
  public void SetScalarModeToPointData()
  {
    SetScalarModeToPointData_5();
  }

  private native void SetCellScalarsFlag_6(int id0);
  public void SetCellScalarsFlag(int id0)
  {
    SetCellScalarsFlag_6(id0);
  }

  private native int GetScalarMode_7();
  public int GetScalarMode()
  {
    return GetScalarMode_7();
  }

  private native void SetRandomMode_8(int id0);
  public void SetRandomMode(int id0)
  {
    SetRandomMode_8(id0);
  }

  private native int GetRandomMode_9();
  public int GetRandomMode()
  {
    return GetRandomMode_9();
  }

  private native void RandomModeOn_10();
  public void RandomModeOn()
  {
    RandomModeOn_10();
  }

  private native void RandomModeOff_11();
  public void RandomModeOff()
  {
    RandomModeOff_11();
  }

  private native void SetController_12(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_12(id0);
  }

  private native long GetController_13();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_13();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkProcessIdScalars() { super(); }

  public vtkProcessIdScalars(long id) { super(id); }
  public native long   VTKInit();

}
