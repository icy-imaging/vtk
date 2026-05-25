// java wrapper for vtkImageSliceMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSliceMapper extends vtkImageMapper3D
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

  private native void SetSliceNumber_4(int id0);
  public void SetSliceNumber(int id0)
  {
    SetSliceNumber_4(id0);
  }

  private native int GetSliceNumber_5();
  public int GetSliceNumber()
  {
    return GetSliceNumber_5();
  }

  private native int GetSliceNumberMinValue_6();
  public int GetSliceNumberMinValue()
  {
    return GetSliceNumberMinValue_6();
  }

  private native int GetSliceNumberMaxValue_7();
  public int GetSliceNumberMaxValue()
  {
    return GetSliceNumberMaxValue_7();
  }

  private native void SetOrientation_8(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_8(id0);
  }

  private native int GetOrientationMinValue_9();
  public int GetOrientationMinValue()
  {
    return GetOrientationMinValue_9();
  }

  private native int GetOrientationMaxValue_10();
  public int GetOrientationMaxValue()
  {
    return GetOrientationMaxValue_10();
  }

  private native int GetOrientation_11();
  public int GetOrientation()
  {
    return GetOrientation_11();
  }

  private native void SetOrientationToI_12();
  public void SetOrientationToI()
  {
    SetOrientationToI_12();
  }

  private native void SetOrientationToJ_13();
  public void SetOrientationToJ()
  {
    SetOrientationToJ_13();
  }

  private native void SetOrientationToK_14();
  public void SetOrientationToK()
  {
    SetOrientationToK_14();
  }

  private native void SetOrientationToX_15();
  public void SetOrientationToX()
  {
    SetOrientationToX_15();
  }

  private native void SetOrientationToY_16();
  public void SetOrientationToY()
  {
    SetOrientationToY_16();
  }

  private native void SetOrientationToZ_17();
  public void SetOrientationToZ()
  {
    SetOrientationToZ_17();
  }

  private native void SetCropping_18(int id0);
  public void SetCropping(int id0)
  {
    SetCropping_18(id0);
  }

  private native void CroppingOn_19();
  public void CroppingOn()
  {
    CroppingOn_19();
  }

  private native void CroppingOff_20();
  public void CroppingOff()
  {
    CroppingOff_20();
  }

  private native int GetCropping_21();
  public int GetCropping()
  {
    return GetCropping_21();
  }

  private native void SetCroppingRegion_22(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetCroppingRegion(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetCroppingRegion_22(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCroppingRegion_23(int id0[]);
  public void SetCroppingRegion(int id0[])
  {
    SetCroppingRegion_23(id0);
  }

  private native int[] GetCroppingRegion_24();
  public int[] GetCroppingRegion()
  {
    return GetCroppingRegion_24();
  }

  private native void Render_25(vtkRenderer id0,vtkImageSlice id1);
  public void Render(vtkRenderer id0,vtkImageSlice id1)
  {
    Render_25(id0,id1);
  }

  private native void ReleaseGraphicsResources_26(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_26(id0);
  }

  private native long GetMTime_27();
  public long GetMTime()
  {
    return GetMTime_27();
  }

  private native void GetBounds_28(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_28(id0);
  }

  private native void GetIndexBounds_29(double id0[]);
  public void GetIndexBounds(double id0[])
  {
    GetIndexBounds_29(id0);
  }

  private native void GetSlicePlaneInDataCoords_30(vtkMatrix4x4 id0,double id1[]);
  public void GetSlicePlaneInDataCoords(vtkMatrix4x4 id0,double id1[])
  {
    GetSlicePlaneInDataCoords_30(id0,id1);
  }

  private native void SetDisplayExtent_31(int id0[]);
  public void SetDisplayExtent(int id0[])
  {
    SetDisplayExtent_31(id0);
  }

  public vtkImageSliceMapper() { super(); }

  public vtkImageSliceMapper(long id) { super(id); }
  public native long   VTKInit();

}
