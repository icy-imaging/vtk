// java wrapper for vtkMarkBoundaryFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMarkBoundaryFilter extends vtkDataSetAlgorithm
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

  private native void SetGenerateBoundaryFaces_4(boolean id0);
  public void SetGenerateBoundaryFaces(boolean id0)
  {
    SetGenerateBoundaryFaces_4(id0);
  }

  private native boolean GetGenerateBoundaryFaces_5();
  public boolean GetGenerateBoundaryFaces()
  {
    return GetGenerateBoundaryFaces_5();
  }

  private native void GenerateBoundaryFacesOn_6();
  public void GenerateBoundaryFacesOn()
  {
    GenerateBoundaryFacesOn_6();
  }

  private native void GenerateBoundaryFacesOff_7();
  public void GenerateBoundaryFacesOff()
  {
    GenerateBoundaryFacesOff_7();
  }

  private native void SetBoundaryPointsName_8(byte[] id0, int len0);
  public void SetBoundaryPointsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBoundaryPointsName_8(bytes0, bytes0.length);
  }

  private native byte[] GetBoundaryPointsName_9();
  public String GetBoundaryPointsName()
  {
    return new String(GetBoundaryPointsName_9(), StandardCharsets.UTF_8);
  }

  private native void SetBoundaryCellsName_10(byte[] id0, int len0);
  public void SetBoundaryCellsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBoundaryCellsName_10(bytes0, bytes0.length);
  }

  private native byte[] GetBoundaryCellsName_11();
  public String GetBoundaryCellsName()
  {
    return new String(GetBoundaryCellsName_11(), StandardCharsets.UTF_8);
  }

  private native void SetBoundaryFacesName_12(byte[] id0, int len0);
  public void SetBoundaryFacesName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBoundaryFacesName_12(bytes0, bytes0.length);
  }

  private native byte[] GetBoundaryFacesName_13();
  public String GetBoundaryFacesName()
  {
    return new String(GetBoundaryFacesName_13(), StandardCharsets.UTF_8);
  }

  public vtkMarkBoundaryFilter() { super(); }

  public vtkMarkBoundaryFilter(long id) { super(id); }
  public native long   VTKInit();

}
