// java wrapper for vtkDijkstraImageGeodesicPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDijkstraImageGeodesicPath extends vtkDijkstraGraphGeodesicPath
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

  private native void SetInputData_4(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInputAsImageData_5();
  public vtkImageData GetInputAsImageData()
  {
    long temp = GetInputAsImageData_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageWeight_6(double id0);
  public void SetImageWeight(double id0)
  {
    SetImageWeight_6(id0);
  }

  private native double GetImageWeight_7();
  public double GetImageWeight()
  {
    return GetImageWeight_7();
  }

  private native void SetEdgeLengthWeight_8(double id0);
  public void SetEdgeLengthWeight(double id0)
  {
    SetEdgeLengthWeight_8(id0);
  }

  private native double GetEdgeLengthWeight_9();
  public double GetEdgeLengthWeight()
  {
    return GetEdgeLengthWeight_9();
  }

  private native void SetCurvatureWeight_10(double id0);
  public void SetCurvatureWeight(double id0)
  {
    SetCurvatureWeight_10(id0);
  }

  private native double GetCurvatureWeightMinValue_11();
  public double GetCurvatureWeightMinValue()
  {
    return GetCurvatureWeightMinValue_11();
  }

  private native double GetCurvatureWeightMaxValue_12();
  public double GetCurvatureWeightMaxValue()
  {
    return GetCurvatureWeightMaxValue_12();
  }

  private native double GetCurvatureWeight_13();
  public double GetCurvatureWeight()
  {
    return GetCurvatureWeight_13();
  }

  public vtkDijkstraImageGeodesicPath() { super(); }

  public vtkDijkstraImageGeodesicPath(long id) { super(id); }
  public native long   VTKInit();

}
