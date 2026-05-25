// java wrapper for vtkPlanesIntersection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlanesIntersection extends vtkPlanes
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

  private native void SetRegionVertices_4(vtkPoints id0);
  public void SetRegionVertices(vtkPoints id0)
  {
    SetRegionVertices_4(id0);
  }

  private native int GetNumberOfRegionVertices_5();
  public int GetNumberOfRegionVertices()
  {
    return GetNumberOfRegionVertices_5();
  }

  private native int GetNumRegionVertices_6();
  public int GetNumRegionVertices()
  {
    return GetNumRegionVertices_6();
  }

  private native int IntersectsRegion_7(vtkPoints id0);
  public int IntersectsRegion(vtkPoints id0)
  {
    return IntersectsRegion_7(id0);
  }

  private native int PolygonIntersectsBBox_8(double id0[],vtkPoints id1);
  public int PolygonIntersectsBBox(double id0[],vtkPoints id1)
  {
    return PolygonIntersectsBBox_8(id0,id1);
  }

  private native long Convert3DCell_9(vtkCell id0);
  public vtkPlanesIntersection Convert3DCell(vtkCell id0)
  {
    long temp = Convert3DCell_9(id0);

    if (temp == 0) return null;
    return (vtkPlanesIntersection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPlanesIntersection() { super(); }

  public vtkPlanesIntersection(long id) { super(id); }
  public native long   VTKInit();

}
