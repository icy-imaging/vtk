// java wrapper for vtkCompositePolyDataMapper2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositePolyDataMapper2 extends vtkOpenGLPolyDataMapper
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

  private native boolean HasOpaqueGeometry_4();
  public boolean HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_4();
  }

  private native boolean HasTranslucentPolygonalGeometry_5();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_5();
  }

  private native void SetCompositeDataDisplayAttributes_6(vtkCompositeDataDisplayAttributes id0);
  public void SetCompositeDataDisplayAttributes(vtkCompositeDataDisplayAttributes id0)
  {
    SetCompositeDataDisplayAttributes_6(id0);
  }

  private native long GetCompositeDataDisplayAttributes_7();
  public vtkCompositeDataDisplayAttributes GetCompositeDataDisplayAttributes()
  {
    long temp = GetCompositeDataDisplayAttributes_7();

    if (temp == 0) return null;
    return (vtkCompositeDataDisplayAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlockVisibility_8(int id0,boolean id1);
  public void SetBlockVisibility(int id0,boolean id1)
  {
    SetBlockVisibility_8(id0,id1);
  }

  private native boolean GetBlockVisibility_9(int id0);
  public boolean GetBlockVisibility(int id0)
  {
    return GetBlockVisibility_9(id0);
  }

  private native void RemoveBlockVisibility_10(int id0);
  public void RemoveBlockVisibility(int id0)
  {
    RemoveBlockVisibility_10(id0);
  }

  private native void RemoveBlockVisibilities_11();
  public void RemoveBlockVisibilities()
  {
    RemoveBlockVisibilities_11();
  }

  private native void SetBlockColor_12(int id0,double id1[]);
  public void SetBlockColor(int id0,double id1[])
  {
    SetBlockColor_12(id0,id1);
  }

  private native void SetBlockColor_13(int id0,double id1,double id2,double id3);
  public void SetBlockColor(int id0,double id1,double id2,double id3)
  {
    SetBlockColor_13(id0,id1,id2,id3);
  }

  private native void RemoveBlockColor_14(int id0);
  public void RemoveBlockColor(int id0)
  {
    RemoveBlockColor_14(id0);
  }

  private native void RemoveBlockColors_15();
  public void RemoveBlockColors()
  {
    RemoveBlockColors_15();
  }

  private native void SetBlockOpacity_16(int id0,double id1);
  public void SetBlockOpacity(int id0,double id1)
  {
    SetBlockOpacity_16(id0,id1);
  }

  private native double GetBlockOpacity_17(int id0);
  public double GetBlockOpacity(int id0)
  {
    return GetBlockOpacity_17(id0);
  }

  private native void RemoveBlockOpacity_18(int id0);
  public void RemoveBlockOpacity(int id0)
  {
    RemoveBlockOpacity_18(id0);
  }

  private native void RemoveBlockOpacities_19();
  public void RemoveBlockOpacities()
  {
    RemoveBlockOpacities_19();
  }

  private native void SetColorMissingArraysWithNanColor_20(boolean id0);
  public void SetColorMissingArraysWithNanColor(boolean id0)
  {
    SetColorMissingArraysWithNanColor_20(id0);
  }

  private native boolean GetColorMissingArraysWithNanColor_21();
  public boolean GetColorMissingArraysWithNanColor()
  {
    return GetColorMissingArraysWithNanColor_21();
  }

  private native void ColorMissingArraysWithNanColorOn_22();
  public void ColorMissingArraysWithNanColorOn()
  {
    ColorMissingArraysWithNanColorOn_22();
  }

  private native void ColorMissingArraysWithNanColorOff_23();
  public void ColorMissingArraysWithNanColorOff()
  {
    ColorMissingArraysWithNanColorOff_23();
  }

  private native void ReleaseGraphicsResources_24(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_24(id0);
  }

  private native void Render_25(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_25(id0,id1);
  }

  private native void SetVBOShiftScaleMethod_26(int id0);
  public void SetVBOShiftScaleMethod(int id0)
  {
    SetVBOShiftScaleMethod_26(id0);
  }

  private native void SetPauseShiftScale_27(boolean id0);
  public void SetPauseShiftScale(boolean id0)
  {
    SetPauseShiftScale_27(id0);
  }

  private native void SetInputArrayToProcess_28(int id0,int id1,int id2,int id3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_28(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native void SetInputArrayToProcess_29(int id0,int id1,int id2,int id3,int id4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,int id4)
  {
    SetInputArrayToProcess_29(id0,id1,id2,id3,id4);
  }

  private native void SetInputArrayToProcess_30(int id0,vtkInformation id1);
  public void SetInputArrayToProcess(int id0,vtkInformation id1)
  {
    SetInputArrayToProcess_30(id0,id1);
  }

  private native long GetMTime_31();
  public long GetMTime()
  {
    return GetMTime_31();
  }

  private native void SetInputArrayToProcess_32(int id0,int id1,int id2,byte[] id3, int len3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,String id3,String id4)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_32(id0,id1,id2,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  public vtkCompositePolyDataMapper2() { super(); }

  public vtkCompositePolyDataMapper2(long id) { super(id); }
  public native long   VTKInit();

}
