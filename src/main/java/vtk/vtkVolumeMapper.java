// java wrapper for vtkVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeMapper extends vtkAbstractVolumeMapper
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

  private native void SetInputData_4(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_4(id0);
  }

  private native void SetInputData_5(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_5(id0);
  }

  private native void SetInputData_6(vtkRectilinearGrid id0);
  public void SetInputData(vtkRectilinearGrid id0)
  {
    SetInputData_6(id0);
  }

  private native long GetInput_7();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_8(int id0);
  public vtkDataSet GetInput(int id0)
  {
    long temp = GetInput_8(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlendMode_9(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_9(id0);
  }

  private native void SetBlendModeToComposite_10();
  public void SetBlendModeToComposite()
  {
    SetBlendModeToComposite_10();
  }

  private native void SetBlendModeToMaximumIntensity_11();
  public void SetBlendModeToMaximumIntensity()
  {
    SetBlendModeToMaximumIntensity_11();
  }

  private native void SetBlendModeToMinimumIntensity_12();
  public void SetBlendModeToMinimumIntensity()
  {
    SetBlendModeToMinimumIntensity_12();
  }

  private native void SetBlendModeToAverageIntensity_13();
  public void SetBlendModeToAverageIntensity()
  {
    SetBlendModeToAverageIntensity_13();
  }

  private native void SetBlendModeToAdditive_14();
  public void SetBlendModeToAdditive()
  {
    SetBlendModeToAdditive_14();
  }

  private native void SetBlendModeToIsoSurface_15();
  public void SetBlendModeToIsoSurface()
  {
    SetBlendModeToIsoSurface_15();
  }

  private native void SetBlendModeToSlice_16();
  public void SetBlendModeToSlice()
  {
    SetBlendModeToSlice_16();
  }

  private native int GetBlendMode_17();
  public int GetBlendMode()
  {
    return GetBlendMode_17();
  }

  private native void SetAverageIPScalarRange_18(double id0,double id1);
  public void SetAverageIPScalarRange(double id0,double id1)
  {
    SetAverageIPScalarRange_18(id0,id1);
  }

  private native void SetAverageIPScalarRange_19(double id0[]);
  public void SetAverageIPScalarRange(double id0[])
  {
    SetAverageIPScalarRange_19(id0);
  }

  private native double[] GetAverageIPScalarRange_20();
  public double[] GetAverageIPScalarRange()
  {
    return GetAverageIPScalarRange_20();
  }

  private native void SetCropping_21(int id0);
  public void SetCropping(int id0)
  {
    SetCropping_21(id0);
  }

  private native int GetCroppingMinValue_22();
  public int GetCroppingMinValue()
  {
    return GetCroppingMinValue_22();
  }

  private native int GetCroppingMaxValue_23();
  public int GetCroppingMaxValue()
  {
    return GetCroppingMaxValue_23();
  }

  private native int GetCropping_24();
  public int GetCropping()
  {
    return GetCropping_24();
  }

  private native void CroppingOn_25();
  public void CroppingOn()
  {
    CroppingOn_25();
  }

  private native void CroppingOff_26();
  public void CroppingOff()
  {
    CroppingOff_26();
  }

  private native void SetCroppingRegionPlanes_27(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCroppingRegionPlanes(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCroppingRegionPlanes_27(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCroppingRegionPlanes_28(double id0[]);
  public void SetCroppingRegionPlanes(double id0[])
  {
    SetCroppingRegionPlanes_28(id0);
  }

  private native double[] GetCroppingRegionPlanes_29();
  public double[] GetCroppingRegionPlanes()
  {
    return GetCroppingRegionPlanes_29();
  }

  private native double[] GetVoxelCroppingRegionPlanes_30();
  public double[] GetVoxelCroppingRegionPlanes()
  {
    return GetVoxelCroppingRegionPlanes_30();
  }

  private native void SetComputeNormalFromOpacity_31(boolean id0);
  public void SetComputeNormalFromOpacity(boolean id0)
  {
    SetComputeNormalFromOpacity_31(id0);
  }

  private native boolean GetComputeNormalFromOpacity_32();
  public boolean GetComputeNormalFromOpacity()
  {
    return GetComputeNormalFromOpacity_32();
  }

  private native void ComputeNormalFromOpacityOn_33();
  public void ComputeNormalFromOpacityOn()
  {
    ComputeNormalFromOpacityOn_33();
  }

  private native void ComputeNormalFromOpacityOff_34();
  public void ComputeNormalFromOpacityOff()
  {
    ComputeNormalFromOpacityOff_34();
  }

  private native void SetCroppingRegionFlags_35(int id0);
  public void SetCroppingRegionFlags(int id0)
  {
    SetCroppingRegionFlags_35(id0);
  }

  private native int GetCroppingRegionFlagsMinValue_36();
  public int GetCroppingRegionFlagsMinValue()
  {
    return GetCroppingRegionFlagsMinValue_36();
  }

  private native int GetCroppingRegionFlagsMaxValue_37();
  public int GetCroppingRegionFlagsMaxValue()
  {
    return GetCroppingRegionFlagsMaxValue_37();
  }

  private native int GetCroppingRegionFlags_38();
  public int GetCroppingRegionFlags()
  {
    return GetCroppingRegionFlags_38();
  }

  private native void SetCroppingRegionFlagsToSubVolume_39();
  public void SetCroppingRegionFlagsToSubVolume()
  {
    SetCroppingRegionFlagsToSubVolume_39();
  }

  private native void SetCroppingRegionFlagsToFence_40();
  public void SetCroppingRegionFlagsToFence()
  {
    SetCroppingRegionFlagsToFence_40();
  }

  private native void SetCroppingRegionFlagsToInvertedFence_41();
  public void SetCroppingRegionFlagsToInvertedFence()
  {
    SetCroppingRegionFlagsToInvertedFence_41();
  }

  private native void SetCroppingRegionFlagsToCross_42();
  public void SetCroppingRegionFlagsToCross()
  {
    SetCroppingRegionFlagsToCross_42();
  }

  private native void SetCroppingRegionFlagsToInvertedCross_43();
  public void SetCroppingRegionFlagsToInvertedCross()
  {
    SetCroppingRegionFlagsToInvertedCross_43();
  }

  private native void Render_44(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_44(id0,id1);
  }

  private native void ReleaseGraphicsResources_45(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_45(id0);
  }

  public vtkVolumeMapper() { super(); }

  public vtkVolumeMapper(long id) { super(id); }

}
