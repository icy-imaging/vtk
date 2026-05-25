// java wrapper for vtkMultiBlockVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiBlockVolumeMapper extends vtkVolumeMapper
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

  private native void SelectScalarArray_4(int id0);
  public void SelectScalarArray(int id0)
  {
    SelectScalarArray_4(id0);
  }

  private native void SelectScalarArray_5(byte[] id0, int len0);
  public void SelectScalarArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectScalarArray_5(bytes0, bytes0.length);
  }

  private native void SetScalarMode_6(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_6(id0);
  }

  private native void SetArrayAccessMode_7(int id0);
  public void SetArrayAccessMode(int id0)
  {
    SetArrayAccessMode_7(id0);
  }

  private native void Render_8(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_8(id0,id1);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native void SetVectorMode_10(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_10(id0);
  }

  private native int GetVectorMode_11();
  public int GetVectorMode()
  {
    return GetVectorMode_11();
  }

  private native void SetVectorComponent_12(int id0);
  public void SetVectorComponent(int id0)
  {
    SetVectorComponent_12(id0);
  }

  private native int GetVectorComponent_13();
  public int GetVectorComponent()
  {
    return GetVectorComponent_13();
  }

  private native void SetBlendMode_14(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_14(id0);
  }

  private native void SetComputeNormalFromOpacity_15(boolean id0);
  public void SetComputeNormalFromOpacity(boolean id0)
  {
    SetComputeNormalFromOpacity_15(id0);
  }

  private native void SetGlobalIlluminationReach_16(float id0);
  public void SetGlobalIlluminationReach(float id0)
  {
    SetGlobalIlluminationReach_16(id0);
  }

  private native float GetGlobalIlluminationReach_17();
  public float GetGlobalIlluminationReach()
  {
    return GetGlobalIlluminationReach_17();
  }

  private native void SetVolumetricScatteringBlending_18(float id0);
  public void SetVolumetricScatteringBlending(float id0)
  {
    SetVolumetricScatteringBlending_18(id0);
  }

  private native float GetVolumetricScatteringBlending_19();
  public float GetVolumetricScatteringBlending()
  {
    return GetVolumetricScatteringBlending_19();
  }

  private native void SetCropping_20(int id0);
  public void SetCropping(int id0)
  {
    SetCropping_20(id0);
  }

  private native void SetCroppingRegionPlanes_21(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCroppingRegionPlanes(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCroppingRegionPlanes_21(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCroppingRegionFlags_22(int id0);
  public void SetCroppingRegionFlags(int id0)
  {
    SetCroppingRegionFlags_22(id0);
  }

  private native void SetRequestedRenderMode_23(int id0);
  public void SetRequestedRenderMode(int id0)
  {
    SetRequestedRenderMode_23(id0);
  }

  private native void SetTransfer2DYAxisArray_24(byte[] id0, int len0);
  public void SetTransfer2DYAxisArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTransfer2DYAxisArray_24(bytes0, bytes0.length);
  }

  private native void GetBounds_25(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_25(id0);
  }

  public vtkMultiBlockVolumeMapper() { super(); }

  public vtkMultiBlockVolumeMapper(long id) { super(id); }
  public native long   VTKInit();

}
