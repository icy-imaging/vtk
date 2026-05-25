// java wrapper for vtkLagrangianBasicIntegrationModel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLagrangianBasicIntegrationModel extends vtkFunctionSet
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

  private native void SetLocator_4(vtkAbstractCellLocator id0);
  public void SetLocator(vtkAbstractCellLocator id0)
  {
    SetLocator_4(id0);
  }

  private native long GetLocator_5();
  public vtkAbstractCellLocator GetLocator()
  {
    long temp = GetLocator_5();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetLocatorsBuilt_6();
  public boolean GetLocatorsBuilt()
  {
    return GetLocatorsBuilt_6();
  }

  private native void SetLocatorsBuilt_7(boolean id0);
  public void SetLocatorsBuilt(boolean id0)
  {
    SetLocatorsBuilt_7(id0);
  }

  private native void SetTracker_8(vtkLagrangianParticleTracker id0);
  public void SetTracker(vtkLagrangianParticleTracker id0)
  {
    SetTracker_8(id0);
  }

  private native void AddDataSet_9(vtkDataSet id0,boolean id1,int id2);
  public void AddDataSet(vtkDataSet id0,boolean id1,int id2)
  {
    AddDataSet_9(id0,id1,id2);
  }

  private native void ClearDataSets_10(boolean id0);
  public void ClearDataSets(boolean id0)
  {
    ClearDataSets_10(id0);
  }

  private native void SetUseInitialIntegrationTime_11(boolean id0);
  public void SetUseInitialIntegrationTime(boolean id0)
  {
    SetUseInitialIntegrationTime_11(id0);
  }

  private native boolean GetUseInitialIntegrationTime_12();
  public boolean GetUseInitialIntegrationTime()
  {
    return GetUseInitialIntegrationTime_12();
  }

  private native void UseInitialIntegrationTimeOn_13();
  public void UseInitialIntegrationTimeOn()
  {
    UseInitialIntegrationTimeOn_13();
  }

  private native void UseInitialIntegrationTimeOff_14();
  public void UseInitialIntegrationTimeOff()
  {
    UseInitialIntegrationTimeOff_14();
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  private native double GetLocatorTolerance_16();
  public double GetLocatorTolerance()
  {
    return GetLocatorTolerance_16();
  }

  private native void SetInputArrayToProcess_17(int id0,int id1,int id2,int id3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_17(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native void SetNonPlanarQuadSupport_18(boolean id0);
  public void SetNonPlanarQuadSupport(boolean id0)
  {
    SetNonPlanarQuadSupport_18(id0);
  }

  private native boolean GetNonPlanarQuadSupport_19();
  public boolean GetNonPlanarQuadSupport()
  {
    return GetNonPlanarQuadSupport_19();
  }

  private native void NonPlanarQuadSupportOn_20();
  public void NonPlanarQuadSupportOn()
  {
    NonPlanarQuadSupportOn_20();
  }

  private native void NonPlanarQuadSupportOff_21();
  public void NonPlanarQuadSupportOff()
  {
    NonPlanarQuadSupportOff_21();
  }

  private native long GetSeedArrayNames_22();
  public vtkStringArray GetSeedArrayNames()
  {
    long temp = GetSeedArrayNames_22();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSeedArrayComps_23();
  public vtkIntArray GetSeedArrayComps()
  {
    long temp = GetSeedArrayComps_23();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSeedArrayTypes_24();
  public vtkIntArray GetSeedArrayTypes()
  {
    long temp = GetSeedArrayTypes_24();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurfaceArrayNames_25();
  public vtkStringArray GetSurfaceArrayNames()
  {
    long temp = GetSurfaceArrayNames_25();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurfaceArrayTypes_26();
  public vtkIntArray GetSurfaceArrayTypes()
  {
    long temp = GetSurfaceArrayTypes_26();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurfaceArrayEnumValues_27();
  public vtkStringArray GetSurfaceArrayEnumValues()
  {
    long temp = GetSurfaceArrayEnumValues_27();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurfaceArrayDefaultValues_28();
  public vtkDoubleArray GetSurfaceArrayDefaultValues()
  {
    long temp = GetSurfaceArrayDefaultValues_28();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurfaceArrayComps_29();
  public vtkIntArray GetSurfaceArrayComps()
  {
    long temp = GetSurfaceArrayComps_29();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetWeightsSize_30();
  public int GetWeightsSize()
  {
    return GetWeightsSize_30();
  }

  private native boolean FinalizeOutputs_31(vtkPolyData id0,vtkDataObject id1);
  public boolean FinalizeOutputs(vtkPolyData id0,vtkDataObject id1)
  {
    return FinalizeOutputs_31(id0,id1);
  }

  private native void PreParticleInitalization_32();
  public void PreParticleInitalization()
  {
    PreParticleInitalization_32();
  }

  private native long GetSeedArray_33(int id0,vtkPointData id1);
  public vtkAbstractArray GetSeedArray(int id0,vtkPointData id1)
  {
    long temp = GetSeedArray_33(id0,id1);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfTrackedUserData_34(int id0);
  public void SetNumberOfTrackedUserData(int id0)
  {
    SetNumberOfTrackedUserData_34(id0);
  }

  private native int GetNumberOfTrackedUserData_35();
  public int GetNumberOfTrackedUserData()
  {
    return GetNumberOfTrackedUserData_35();
  }

  private native void InitializePathData_36(vtkFieldData id0);
  public void InitializePathData(vtkFieldData id0)
  {
    InitializePathData_36(id0);
  }

  private native void InitializeInteractionData_37(vtkFieldData id0);
  public void InitializeInteractionData(vtkFieldData id0)
  {
    InitializeInteractionData_37(id0);
  }

  private native void InitializeParticleData_38(vtkFieldData id0,int id1);
  public void InitializeParticleData(vtkFieldData id0,int id1)
  {
    InitializeParticleData_38(id0,id1);
  }

  public vtkLagrangianBasicIntegrationModel() { super(); }

  public vtkLagrangianBasicIntegrationModel(long id) { super(id); }

}
