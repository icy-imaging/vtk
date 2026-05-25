// java wrapper for vtkUnsignedDistance object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnsignedDistance extends vtkImageAlgorithm
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

  private native int[] GetDimensions_4();
  public int[] GetDimensions()
  {
    return GetDimensions_4();
  }

  private native void SetDimensions_5(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_5(id0,id1,id2);
  }

  private native void SetDimensions_6(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_6(id0);
  }

  private native void SetBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_8(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_8(id0);
  }

  private native double[] GetBounds_9();
  public double[] GetBounds()
  {
    return GetBounds_9();
  }

  private native void SetAdjustBounds_10(int id0);
  public void SetAdjustBounds(int id0)
  {
    SetAdjustBounds_10(id0);
  }

  private native int GetAdjustBounds_11();
  public int GetAdjustBounds()
  {
    return GetAdjustBounds_11();
  }

  private native void AdjustBoundsOn_12();
  public void AdjustBoundsOn()
  {
    AdjustBoundsOn_12();
  }

  private native void AdjustBoundsOff_13();
  public void AdjustBoundsOff()
  {
    AdjustBoundsOff_13();
  }

  private native void SetAdjustDistance_14(double id0);
  public void SetAdjustDistance(double id0)
  {
    SetAdjustDistance_14(id0);
  }

  private native double GetAdjustDistanceMinValue_15();
  public double GetAdjustDistanceMinValue()
  {
    return GetAdjustDistanceMinValue_15();
  }

  private native double GetAdjustDistanceMaxValue_16();
  public double GetAdjustDistanceMaxValue()
  {
    return GetAdjustDistanceMaxValue_16();
  }

  private native double GetAdjustDistance_17();
  public double GetAdjustDistance()
  {
    return GetAdjustDistance_17();
  }

  private native void SetRadius_18(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_18(id0);
  }

  private native double GetRadiusMinValue_19();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_19();
  }

  private native double GetRadiusMaxValue_20();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_20();
  }

  private native double GetRadius_21();
  public double GetRadius()
  {
    return GetRadius_21();
  }

  private native void SetLocator_22(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_22(id0);
  }

  private native long GetLocator_23();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_23();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCapping_24(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_24(id0);
  }

  private native int GetCapping_25();
  public int GetCapping()
  {
    return GetCapping_25();
  }

  private native void CappingOn_26();
  public void CappingOn()
  {
    CappingOn_26();
  }

  private native void CappingOff_27();
  public void CappingOff()
  {
    CappingOff_27();
  }

  private native void SetCapValue_28(double id0);
  public void SetCapValue(double id0)
  {
    SetCapValue_28(id0);
  }

  private native double GetCapValue_29();
  public double GetCapValue()
  {
    return GetCapValue_29();
  }

  private native void SetOutputScalarType_30(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_30(id0);
  }

  private native int GetOutputScalarType_31();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_31();
  }

  private native void SetOutputScalarTypeToFloat_32();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_32();
  }

  private native void SetOutputScalarTypeToDouble_33();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_33();
  }

  private native void StartAppend_34();
  public void StartAppend()
  {
    StartAppend_34();
  }

  private native void Append_35(vtkPolyData id0);
  public void Append(vtkPolyData id0)
  {
    Append_35(id0);
  }

  private native void EndAppend_36();
  public void EndAppend()
  {
    EndAppend_36();
  }

  public vtkUnsignedDistance() { super(); }

  public vtkUnsignedDistance(long id) { super(id); }
  public native long   VTKInit();

}
