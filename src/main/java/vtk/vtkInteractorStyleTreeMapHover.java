// java wrapper for vtkInteractorStyleTreeMapHover object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleTreeMapHover extends vtkInteractorStyleImage
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

  private native void SetLayout_4(vtkTreeMapLayout id0);
  public void SetLayout(vtkTreeMapLayout id0)
  {
    SetLayout_4(id0);
  }

  private native long GetLayout_5();
  public vtkTreeMapLayout GetLayout()
  {
    long temp = GetLayout_5();

    if (temp == 0) return null;
    return (vtkTreeMapLayout)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTreeMapToPolyData_6(vtkTreeMapToPolyData id0);
  public void SetTreeMapToPolyData(vtkTreeMapToPolyData id0)
  {
    SetTreeMapToPolyData_6(id0);
  }

  private native long GetTreeMapToPolyData_7();
  public vtkTreeMapToPolyData GetTreeMapToPolyData()
  {
    long temp = GetTreeMapToPolyData_7();

    if (temp == 0) return null;
    return (vtkTreeMapToPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelField_8(byte[] id0, int len0);
  public void SetLabelField(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelField_8(bytes0, bytes0.length);
  }

  private native byte[] GetLabelField_9();
  public String GetLabelField()
  {
    return new String(GetLabelField_9(), StandardCharsets.UTF_8);
  }

  private native void OnMouseMove_10();
  public void OnMouseMove()
  {
    OnMouseMove_10();
  }

  private native void OnLeftButtonUp_11();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_11();
  }

  private native void HighLightItem_12(long id0);
  public void HighLightItem(long id0)
  {
    HighLightItem_12(id0);
  }

  private native void HighLightCurrentSelectedItem_13();
  public void HighLightCurrentSelectedItem()
  {
    HighLightCurrentSelectedItem_13();
  }

  private native void SetInteractor_14(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_14(id0);
  }

  private native void SetHighLightColor_15(double id0,double id1,double id2);
  public void SetHighLightColor(double id0,double id1,double id2)
  {
    SetHighLightColor_15(id0,id1,id2);
  }

  private native void SetSelectionLightColor_16(double id0,double id1,double id2);
  public void SetSelectionLightColor(double id0,double id1,double id2)
  {
    SetSelectionLightColor_16(id0,id1,id2);
  }

  private native void SetHighLightWidth_17(double id0);
  public void SetHighLightWidth(double id0)
  {
    SetHighLightWidth_17(id0);
  }

  private native double GetHighLightWidth_18();
  public double GetHighLightWidth()
  {
    return GetHighLightWidth_18();
  }

  private native void SetSelectionWidth_19(double id0);
  public void SetSelectionWidth(double id0)
  {
    SetSelectionWidth_19(id0);
  }

  private native double GetSelectionWidth_20();
  public double GetSelectionWidth()
  {
    return GetSelectionWidth_20();
  }

  public vtkInteractorStyleTreeMapHover() { super(); }

  public vtkInteractorStyleTreeMapHover(long id) { super(id); }
  public native long   VTKInit();

}
