// java wrapper for vtk3DWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DWidget extends vtkInteractorObserver
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

  private native void PlaceWidget_4(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_4(id0);
  }

  private native void PlaceWidget_5();
  public void PlaceWidget()
  {
    PlaceWidget_5();
  }

  private native void PlaceWidget_6(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetProp3D_7(vtkProp3D id0);
  public void SetProp3D(vtkProp3D id0)
  {
    SetProp3D_7(id0);
  }

  private native long GetProp3D_8();
  public vtkProp3D GetProp3D()
  {
    long temp = GetProp3D_8();

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_9(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_9(id0);
  }

  private native void SetInputConnection_10(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_10(id0);
  }

  private native long GetInput_11();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_11();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlaceFactor_12(double id0);
  public void SetPlaceFactor(double id0)
  {
    SetPlaceFactor_12(id0);
  }

  private native double GetPlaceFactorMinValue_13();
  public double GetPlaceFactorMinValue()
  {
    return GetPlaceFactorMinValue_13();
  }

  private native double GetPlaceFactorMaxValue_14();
  public double GetPlaceFactorMaxValue()
  {
    return GetPlaceFactorMaxValue_14();
  }

  private native double GetPlaceFactor_15();
  public double GetPlaceFactor()
  {
    return GetPlaceFactor_15();
  }

  private native void SetHandleSize_16(double id0);
  public void SetHandleSize(double id0)
  {
    SetHandleSize_16(id0);
  }

  private native double GetHandleSizeMinValue_17();
  public double GetHandleSizeMinValue()
  {
    return GetHandleSizeMinValue_17();
  }

  private native double GetHandleSizeMaxValue_18();
  public double GetHandleSizeMaxValue()
  {
    return GetHandleSizeMaxValue_18();
  }

  private native double GetHandleSize_19();
  public double GetHandleSize()
  {
    return GetHandleSize_19();
  }

  public vtk3DWidget() { super(); }

  public vtk3DWidget(long id) { super(id); }

}
