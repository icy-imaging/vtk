// java wrapper for vtkInteractorStyleAreaSelectHover object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleAreaSelectHover extends vtkInteractorStyleRubberBand2D
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

  private native void SetLayout_4(vtkAreaLayout id0);
  public void SetLayout(vtkAreaLayout id0)
  {
    SetLayout_4(id0);
  }

  private native long GetLayout_5();
  public vtkAreaLayout GetLayout()
  {
    long temp = GetLayout_5();

    if (temp == 0) return null;
    return (vtkAreaLayout)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelField_6(byte[] id0, int len0);
  public void SetLabelField(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelField_6(bytes0, bytes0.length);
  }

  private native byte[] GetLabelField_7();
  public String GetLabelField()
  {
    return new String(GetLabelField_7(), StandardCharsets.UTF_8);
  }

  private native void SetUseRectangularCoordinates_8(boolean id0);
  public void SetUseRectangularCoordinates(boolean id0)
  {
    SetUseRectangularCoordinates_8(id0);
  }

  private native boolean GetUseRectangularCoordinates_9();
  public boolean GetUseRectangularCoordinates()
  {
    return GetUseRectangularCoordinates_9();
  }

  private native void UseRectangularCoordinatesOn_10();
  public void UseRectangularCoordinatesOn()
  {
    UseRectangularCoordinatesOn_10();
  }

  private native void UseRectangularCoordinatesOff_11();
  public void UseRectangularCoordinatesOff()
  {
    UseRectangularCoordinatesOff_11();
  }

  private native void OnMouseMove_12();
  public void OnMouseMove()
  {
    OnMouseMove_12();
  }

  private native void SetInteractor_13(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_13(id0);
  }

  private native void SetHighLightColor_14(double id0,double id1,double id2);
  public void SetHighLightColor(double id0,double id1,double id2)
  {
    SetHighLightColor_14(id0,id1,id2);
  }

  private native void SetHighLightWidth_15(double id0);
  public void SetHighLightWidth(double id0)
  {
    SetHighLightWidth_15(id0);
  }

  private native double GetHighLightWidth_16();
  public double GetHighLightWidth()
  {
    return GetHighLightWidth_16();
  }

  private native long GetIdAtPos_17(int id0,int id1);
  public long GetIdAtPos(int id0,int id1)
  {
    return GetIdAtPos_17(id0,id1);
  }

  public vtkInteractorStyleAreaSelectHover() { super(); }

  public vtkInteractorStyleAreaSelectHover(long id) { super(id); }
  public native long   VTKInit();

}
