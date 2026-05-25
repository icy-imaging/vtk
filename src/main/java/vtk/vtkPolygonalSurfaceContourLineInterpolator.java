// java wrapper for vtkPolygonalSurfaceContourLineInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolygonalSurfaceContourLineInterpolator extends vtkPolyDataContourLineInterpolator
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

  private native int InterpolateLine_4(vtkRenderer id0,vtkContourRepresentation id1,int id2,int id3);
  public int InterpolateLine(vtkRenderer id0,vtkContourRepresentation id1,int id2,int id3)
  {
    return InterpolateLine_4(id0,id1,id2,id3);
  }

  private native void SetDistanceOffset_5(double id0);
  public void SetDistanceOffset(double id0)
  {
    SetDistanceOffset_5(id0);
  }

  private native double GetDistanceOffset_6();
  public double GetDistanceOffset()
  {
    return GetDistanceOffset_6();
  }

  private native void GetContourPointIds_7(vtkContourRepresentation id0,vtkIdList id1);
  public void GetContourPointIds(vtkContourRepresentation id0,vtkIdList id1)
  {
    GetContourPointIds_7(id0,id1);
  }

  public vtkPolygonalSurfaceContourLineInterpolator() { super(); }

  public vtkPolygonalSurfaceContourLineInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
