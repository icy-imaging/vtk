// java wrapper for vtkPlotHistogram2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotHistogram2D extends vtkPlot
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

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native void SetInputData_6(vtkImageData id0,long id1);
  public void SetInputData(vtkImageData id0,long id1)
  {
    SetInputData_6(id0,id1);
  }

  private native void SetInputData_7(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_7(id0);
  }

  private native void SetInputData_8(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetInputData(vtkTable id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInputData_8(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native long GetInputImageData_9();
  public vtkImageData GetInputImageData()
  {
    long temp = GetInputImageData_9();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransferFunction_10(vtkScalarsToColors id0);
  public void SetTransferFunction(vtkScalarsToColors id0)
  {
    SetTransferFunction_10(id0);
  }

  private native long GetTransferFunction_11();
  public vtkScalarsToColors GetTransferFunction()
  {
    long temp = GetTransferFunction_11();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetBounds_12(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_12(id0);
  }

  private native void SetArrayName_13(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_13(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_14();
  public String GetArrayName()
  {
    return new String(GetArrayName_14(), StandardCharsets.UTF_8);
  }

  private native boolean UpdateCache_15();
  public boolean UpdateCache()
  {
    return UpdateCache_15();
  }

  public vtkPlotHistogram2D() { super(); }

  public vtkPlotHistogram2D(long id) { super(id); }
  public native long   VTKInit();

}
