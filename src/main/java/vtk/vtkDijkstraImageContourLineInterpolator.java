// java wrapper for vtkDijkstraImageContourLineInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDijkstraImageContourLineInterpolator extends vtkContourLineInterpolator
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

  private native void SetCostImage_5(vtkImageData id0);
  public void SetCostImage(vtkImageData id0)
  {
    SetCostImage_5(id0);
  }

  private native long GetCostImage_6();
  public vtkImageData GetCostImage()
  {
    long temp = GetCostImage_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDijkstraImageGeodesicPath_7();
  public vtkDijkstraImageGeodesicPath GetDijkstraImageGeodesicPath()
  {
    long temp = GetDijkstraImageGeodesicPath_7();

    if (temp == 0) return null;
    return (vtkDijkstraImageGeodesicPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDijkstraImageContourLineInterpolator() { super(); }

  public vtkDijkstraImageContourLineInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
