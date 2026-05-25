// java wrapper for vtkPropPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPropPicker extends vtkAbstractPropPicker
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

  private native int PickProp_4(double id0,double id1,vtkRenderer id2);
  public int PickProp(double id0,double id1,vtkRenderer id2)
  {
    return PickProp_4(id0,id1,id2);
  }

  private native int PickProp_5(double id0,double id1,vtkRenderer id2,vtkPropCollection id3);
  public int PickProp(double id0,double id1,vtkRenderer id2,vtkPropCollection id3)
  {
    return PickProp_5(id0,id1,id2,id3);
  }

  private native int Pick_6(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_6(id0,id1,id2,id3);
  }

  private native int Pick_7(double id0[],vtkRenderer id1);
  public int Pick(double id0[],vtkRenderer id1)
  {
    return Pick_7(id0,id1);
  }

  private native int Pick3DPoint_8(double id0[],vtkRenderer id1);
  public int Pick3DPoint(double id0[],vtkRenderer id1)
  {
    return Pick3DPoint_8(id0,id1);
  }

  private native int PickProp3DPoint_9(double id0[],vtkRenderer id1);
  public int PickProp3DPoint(double id0[],vtkRenderer id1)
  {
    return PickProp3DPoint_9(id0,id1);
  }

  private native int PickProp3DPoint_10(double id0[],vtkRenderer id1,vtkPropCollection id2);
  public int PickProp3DPoint(double id0[],vtkRenderer id1,vtkPropCollection id2)
  {
    return PickProp3DPoint_10(id0,id1,id2);
  }

  private native int PickProp3DRay_11(double id0[],double id1[],vtkRenderer id2,vtkPropCollection id3);
  public int PickProp3DRay(double id0[],double id1[],vtkRenderer id2,vtkPropCollection id3)
  {
    return PickProp3DRay_11(id0,id1,id2,id3);
  }

  private native int Pick3DRay_12(double id0[],double id1[],vtkRenderer id2);
  public int Pick3DRay(double id0[],double id1[],vtkRenderer id2)
  {
    return Pick3DRay_12(id0,id1,id2);
  }

  public vtkPropPicker() { super(); }

  public vtkPropPicker(long id) { super(id); }
  public native long   VTKInit();

}
