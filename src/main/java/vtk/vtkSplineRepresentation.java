// java wrapper for vtkSplineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplineRepresentation extends vtkAbstractSplineRepresentation
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

  private native void SetNumberOfHandles_4(int id0);
  public void SetNumberOfHandles(int id0)
  {
    SetNumberOfHandles_4(id0);
  }

  private native void SetParametricSpline_5(vtkParametricSpline id0);
  public void SetParametricSpline(vtkParametricSpline id0)
  {
    SetParametricSpline_5(id0);
  }

  private native void InitializeHandles_6(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_6(id0);
  }

  private native void BuildRepresentation_7();
  public void BuildRepresentation()
  {
    BuildRepresentation_7();
  }

  public vtkSplineRepresentation() { super(); }

  public vtkSplineRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
