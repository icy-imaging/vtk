// java wrapper for vtkCameraPathRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraPathRepresentation extends vtkAbstractSplineRepresentation
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

  private native void SetDirectional_4(boolean id0);
  public void SetDirectional(boolean id0)
  {
    SetDirectional_4(id0);
  }

  private native void SetNumberOfHandles_5(int id0);
  public void SetNumberOfHandles(int id0)
  {
    SetNumberOfHandles_5(id0);
  }

  private native void SetParametricSpline_6(vtkParametricSpline id0);
  public void SetParametricSpline(vtkParametricSpline id0)
  {
    SetParametricSpline_6(id0);
  }

  private native void InitializeHandles_7(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_7(id0);
  }

  private native void BuildRepresentation_8();
  public void BuildRepresentation()
  {
    BuildRepresentation_8();
  }

  private native void AddCameraAt_9(vtkCamera id0,int id1);
  public void AddCameraAt(vtkCamera id0,int id1)
  {
    AddCameraAt_9(id0,id1);
  }

  private native void DeleteCameraAt_10(int id0);
  public void DeleteCameraAt(int id0)
  {
    DeleteCameraAt_10(id0);
  }

  public vtkCameraPathRepresentation() { super(); }

  public vtkCameraPathRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
