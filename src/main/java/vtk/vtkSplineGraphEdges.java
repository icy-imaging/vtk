// java wrapper for vtkSplineGraphEdges object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplineGraphEdges extends vtkGraphAlgorithm
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

  private native void SetSpline_4(vtkSpline id0);
  public void SetSpline(vtkSpline id0)
  {
    SetSpline_4(id0);
  }

  private native long GetSpline_5();
  public vtkSpline GetSpline()
  {
    long temp = GetSpline_5();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSplineType_6(int id0);
  public void SetSplineType(int id0)
  {
    SetSplineType_6(id0);
  }

  private native int GetSplineType_7();
  public int GetSplineType()
  {
    return GetSplineType_7();
  }

  private native void SetNumberOfSubdivisions_8(long id0);
  public void SetNumberOfSubdivisions(long id0)
  {
    SetNumberOfSubdivisions_8(id0);
  }

  private native long GetNumberOfSubdivisions_9();
  public long GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_9();
  }

  public vtkSplineGraphEdges() { super(); }

  public vtkSplineGraphEdges(long id) { super(id); }
  public native long   VTKInit();

}
