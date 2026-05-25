// java wrapper for vtkROIStencilSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkROIStencilSource extends vtkImageStencilSource
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

  private native int GetShape_4();
  public int GetShape()
  {
    return GetShape_4();
  }

  private native void SetShape_5(int id0);
  public void SetShape(int id0)
  {
    SetShape_5(id0);
  }

  private native int GetShapeMinValue_6();
  public int GetShapeMinValue()
  {
    return GetShapeMinValue_6();
  }

  private native int GetShapeMaxValue_7();
  public int GetShapeMaxValue()
  {
    return GetShapeMaxValue_7();
  }

  private native void SetShapeToBox_8();
  public void SetShapeToBox()
  {
    SetShapeToBox_8();
  }

  private native void SetShapeToEllipsoid_9();
  public void SetShapeToEllipsoid()
  {
    SetShapeToEllipsoid_9();
  }

  private native void SetShapeToCylinderX_10();
  public void SetShapeToCylinderX()
  {
    SetShapeToCylinderX_10();
  }

  private native void SetShapeToCylinderY_11();
  public void SetShapeToCylinderY()
  {
    SetShapeToCylinderY_11();
  }

  private native void SetShapeToCylinderZ_12();
  public void SetShapeToCylinderZ()
  {
    SetShapeToCylinderZ_12();
  }

  private native byte[] GetShapeAsString_13();
  public String GetShapeAsString()
  {
    return new String(GetShapeAsString_13(), StandardCharsets.UTF_8);
  }

  private native double[] GetBounds_14();
  public double[] GetBounds()
  {
    return GetBounds_14();
  }

  private native void SetBounds_15(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_15(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_16(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_16(id0);
  }

  public vtkROIStencilSource() { super(); }

  public vtkROIStencilSource(long id) { super(id); }
  public native long   VTKInit();

}
