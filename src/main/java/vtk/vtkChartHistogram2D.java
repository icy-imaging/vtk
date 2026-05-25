// java wrapper for vtkChartHistogram2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartHistogram2D extends vtkChartXY
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native void SetInputData_5(vtkImageData id0,long id1);
  public void SetInputData(vtkImageData id0,long id1)
  {
    SetInputData_5(id0,id1);
  }

  private native void SetTransferFunction_6(vtkScalarsToColors id0);
  public void SetTransferFunction(vtkScalarsToColors id0)
  {
    SetTransferFunction_6(id0);
  }

  private native long GetPlot_7(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_7(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkChartHistogram2D() { super(); }

  public vtkChartHistogram2D(long id) { super(id); }
  public native long   VTKInit();

}
