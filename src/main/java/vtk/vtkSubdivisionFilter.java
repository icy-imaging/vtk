// java wrapper for vtkSubdivisionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSubdivisionFilter extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfSubdivisions_4(int id0);
  public void SetNumberOfSubdivisions(int id0)
  {
    SetNumberOfSubdivisions_4(id0);
  }

  private native int GetNumberOfSubdivisions_5();
  public int GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_5();
  }

  private native void SetCheckForTriangles_6(int id0);
  public void SetCheckForTriangles(int id0)
  {
    SetCheckForTriangles_6(id0);
  }

  private native int GetCheckForTrianglesMinValue_7();
  public int GetCheckForTrianglesMinValue()
  {
    return GetCheckForTrianglesMinValue_7();
  }

  private native int GetCheckForTrianglesMaxValue_8();
  public int GetCheckForTrianglesMaxValue()
  {
    return GetCheckForTrianglesMaxValue_8();
  }

  private native int GetCheckForTriangles_9();
  public int GetCheckForTriangles()
  {
    return GetCheckForTriangles_9();
  }

  private native void CheckForTrianglesOn_10();
  public void CheckForTrianglesOn()
  {
    CheckForTrianglesOn_10();
  }

  private native void CheckForTrianglesOff_11();
  public void CheckForTrianglesOff()
  {
    CheckForTrianglesOff_11();
  }

  public vtkSubdivisionFilter() { super(); }

  public vtkSubdivisionFilter(long id) { super(id); }

}
