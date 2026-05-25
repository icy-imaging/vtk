// java wrapper for vtkAMRResampleFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRResampleFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetNumberOfSamples_4(int id0,int id1,int id2);
  public void SetNumberOfSamples(int id0,int id1,int id2)
  {
    SetNumberOfSamples_4(id0,id1,id2);
  }

  private native void SetNumberOfSamples_5(int id0[]);
  public void SetNumberOfSamples(int id0[])
  {
    SetNumberOfSamples_5(id0);
  }

  private native int[] GetNumberOfSamples_6();
  public int[] GetNumberOfSamples()
  {
    return GetNumberOfSamples_6();
  }

  private native void SetTransferToNodes_7(int id0);
  public void SetTransferToNodes(int id0)
  {
    SetTransferToNodes_7(id0);
  }

  private native int GetTransferToNodes_8();
  public int GetTransferToNodes()
  {
    return GetTransferToNodes_8();
  }

  private native void SetDemandDrivenMode_9(int id0);
  public void SetDemandDrivenMode(int id0)
  {
    SetDemandDrivenMode_9(id0);
  }

  private native int GetDemandDrivenMode_10();
  public int GetDemandDrivenMode()
  {
    return GetDemandDrivenMode_10();
  }

  private native void SetNumberOfPartitions_11(int id0);
  public void SetNumberOfPartitions(int id0)
  {
    SetNumberOfPartitions_11(id0);
  }

  private native int GetNumberOfPartitions_12();
  public int GetNumberOfPartitions()
  {
    return GetNumberOfPartitions_12();
  }

  private native void SetMin_13(double id0,double id1,double id2);
  public void SetMin(double id0,double id1,double id2)
  {
    SetMin_13(id0,id1,id2);
  }

  private native void SetMin_14(double id0[]);
  public void SetMin(double id0[])
  {
    SetMin_14(id0);
  }

  private native double[] GetMin_15();
  public double[] GetMin()
  {
    return GetMin_15();
  }

  private native void SetMax_16(double id0,double id1,double id2);
  public void SetMax(double id0,double id1,double id2)
  {
    SetMax_16(id0,id1,id2);
  }

  private native void SetMax_17(double id0[]);
  public void SetMax(double id0[])
  {
    SetMax_17(id0);
  }

  private native double[] GetMax_18();
  public double[] GetMax()
  {
    return GetMax_18();
  }

  private native void SetUseBiasVector_19(boolean id0);
  public void SetUseBiasVector(boolean id0)
  {
    SetUseBiasVector_19(id0);
  }

  private native boolean GetUseBiasVector_20();
  public boolean GetUseBiasVector()
  {
    return GetUseBiasVector_20();
  }

  private native void SetBiasVector_21(double id0,double id1,double id2);
  public void SetBiasVector(double id0,double id1,double id2)
  {
    SetBiasVector_21(id0,id1,id2);
  }

  private native void SetBiasVector_22(double id0[]);
  public void SetBiasVector(double id0[])
  {
    SetBiasVector_22(id0);
  }

  private native double[] GetBiasVector_23();
  public double[] GetBiasVector()
  {
    return GetBiasVector_23();
  }

  private native void SetController_24(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_24(id0);
  }

  private native long GetController_25();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_25();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FillInputPortInformation_26(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_26(id0,id1);
  }

  private native int FillOutputPortInformation_27(int id0,vtkInformation id1);
  public int FillOutputPortInformation(int id0,vtkInformation id1)
  {
    return FillOutputPortInformation_27(id0,id1);
  }

  public vtkAMRResampleFilter() { super(); }

  public vtkAMRResampleFilter(long id) { super(id); }
  public native long   VTKInit();

}
