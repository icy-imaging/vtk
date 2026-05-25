// java wrapper for vtkPieceScalars object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPieceScalars extends vtkDataSetAlgorithm
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

  private native int GetScalarMode_6();
  public int GetScalarMode()
  {
    return GetScalarMode_6();
  }

  private native void SetRandomMode_7(int id0);
  public void SetRandomMode(int id0)
  {
    SetRandomMode_7(id0);
  }

  private native int GetRandomMode_8();
  public int GetRandomMode()
  {
    return GetRandomMode_8();
  }

  private native void RandomModeOn_9();
  public void RandomModeOn()
  {
    RandomModeOn_9();
  }

  private native void RandomModeOff_10();
  public void RandomModeOff()
  {
    RandomModeOff_10();
  }

  public vtkPieceScalars() { super(); }

  public vtkPieceScalars(long id) { super(id); }
  public native long   VTKInit();

}
