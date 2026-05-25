// java wrapper for vtkHyperStreamline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperStreamline extends vtkPolyDataAlgorithm
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

  private native void SetStartLocation_4(long id0,int id1,double id2[]);
  public void SetStartLocation(long id0,int id1,double id2[])
  {
    SetStartLocation_4(id0,id1,id2);
  }

  private native void SetStartLocation_5(long id0,int id1,double id2,double id3,double id4);
  public void SetStartLocation(long id0,int id1,double id2,double id3,double id4)
  {
    SetStartLocation_5(id0,id1,id2,id3,id4);
  }

  private native void SetStartPosition_6(double id0[]);
  public void SetStartPosition(double id0[])
  {
    SetStartPosition_6(id0);
  }

  private native void SetStartPosition_7(double id0,double id1,double id2);
  public void SetStartPosition(double id0,double id1,double id2)
  {
    SetStartPosition_7(id0,id1,id2);
  }

  private native double[] GetStartPosition_8();
  public double[] GetStartPosition()
  {
    return GetStartPosition_8();
  }

  private native void SetMaximumPropagationDistance_9(double id0);
  public void SetMaximumPropagationDistance(double id0)
  {
    SetMaximumPropagationDistance_9(id0);
  }

  private native double GetMaximumPropagationDistanceMinValue_10();
  public double GetMaximumPropagationDistanceMinValue()
  {
    return GetMaximumPropagationDistanceMinValue_10();
  }

  private native double GetMaximumPropagationDistanceMaxValue_11();
  public double GetMaximumPropagationDistanceMaxValue()
  {
    return GetMaximumPropagationDistanceMaxValue_11();
  }

  private native double GetMaximumPropagationDistance_12();
  public double GetMaximumPropagationDistance()
  {
    return GetMaximumPropagationDistance_12();
  }

  private native void SetIntegrationEigenvector_13(int id0);
  public void SetIntegrationEigenvector(int id0)
  {
    SetIntegrationEigenvector_13(id0);
  }

  private native int GetIntegrationEigenvectorMinValue_14();
  public int GetIntegrationEigenvectorMinValue()
  {
    return GetIntegrationEigenvectorMinValue_14();
  }

  private native int GetIntegrationEigenvectorMaxValue_15();
  public int GetIntegrationEigenvectorMaxValue()
  {
    return GetIntegrationEigenvectorMaxValue_15();
  }

  private native int GetIntegrationEigenvector_16();
  public int GetIntegrationEigenvector()
  {
    return GetIntegrationEigenvector_16();
  }

  private native void SetIntegrationEigenvectorToMajor_17();
  public void SetIntegrationEigenvectorToMajor()
  {
    SetIntegrationEigenvectorToMajor_17();
  }

  private native void SetIntegrationEigenvectorToMedium_18();
  public void SetIntegrationEigenvectorToMedium()
  {
    SetIntegrationEigenvectorToMedium_18();
  }

  private native void SetIntegrationEigenvectorToMinor_19();
  public void SetIntegrationEigenvectorToMinor()
  {
    SetIntegrationEigenvectorToMinor_19();
  }

  private native void IntegrateMajorEigenvector_20();
  public void IntegrateMajorEigenvector()
  {
    IntegrateMajorEigenvector_20();
  }

  private native void IntegrateMediumEigenvector_21();
  public void IntegrateMediumEigenvector()
  {
    IntegrateMediumEigenvector_21();
  }

  private native void IntegrateMinorEigenvector_22();
  public void IntegrateMinorEigenvector()
  {
    IntegrateMinorEigenvector_22();
  }

  private native void SetIntegrationStepLength_23(double id0);
  public void SetIntegrationStepLength(double id0)
  {
    SetIntegrationStepLength_23(id0);
  }

  private native double GetIntegrationStepLengthMinValue_24();
  public double GetIntegrationStepLengthMinValue()
  {
    return GetIntegrationStepLengthMinValue_24();
  }

  private native double GetIntegrationStepLengthMaxValue_25();
  public double GetIntegrationStepLengthMaxValue()
  {
    return GetIntegrationStepLengthMaxValue_25();
  }

  private native double GetIntegrationStepLength_26();
  public double GetIntegrationStepLength()
  {
    return GetIntegrationStepLength_26();
  }

  private native void SetStepLength_27(double id0);
  public void SetStepLength(double id0)
  {
    SetStepLength_27(id0);
  }

  private native double GetStepLengthMinValue_28();
  public double GetStepLengthMinValue()
  {
    return GetStepLengthMinValue_28();
  }

  private native double GetStepLengthMaxValue_29();
  public double GetStepLengthMaxValue()
  {
    return GetStepLengthMaxValue_29();
  }

  private native double GetStepLength_30();
  public double GetStepLength()
  {
    return GetStepLength_30();
  }

  private native void SetIntegrationDirection_31(int id0);
  public void SetIntegrationDirection(int id0)
  {
    SetIntegrationDirection_31(id0);
  }

  private native int GetIntegrationDirectionMinValue_32();
  public int GetIntegrationDirectionMinValue()
  {
    return GetIntegrationDirectionMinValue_32();
  }

  private native int GetIntegrationDirectionMaxValue_33();
  public int GetIntegrationDirectionMaxValue()
  {
    return GetIntegrationDirectionMaxValue_33();
  }

  private native int GetIntegrationDirection_34();
  public int GetIntegrationDirection()
  {
    return GetIntegrationDirection_34();
  }

  private native void SetIntegrationDirectionToForward_35();
  public void SetIntegrationDirectionToForward()
  {
    SetIntegrationDirectionToForward_35();
  }

  private native void SetIntegrationDirectionToBackward_36();
  public void SetIntegrationDirectionToBackward()
  {
    SetIntegrationDirectionToBackward_36();
  }

  private native void SetIntegrationDirectionToIntegrateBothDirections_37();
  public void SetIntegrationDirectionToIntegrateBothDirections()
  {
    SetIntegrationDirectionToIntegrateBothDirections_37();
  }

  private native void SetTerminalEigenvalue_38(double id0);
  public void SetTerminalEigenvalue(double id0)
  {
    SetTerminalEigenvalue_38(id0);
  }

  private native double GetTerminalEigenvalueMinValue_39();
  public double GetTerminalEigenvalueMinValue()
  {
    return GetTerminalEigenvalueMinValue_39();
  }

  private native double GetTerminalEigenvalueMaxValue_40();
  public double GetTerminalEigenvalueMaxValue()
  {
    return GetTerminalEigenvalueMaxValue_40();
  }

  private native double GetTerminalEigenvalue_41();
  public double GetTerminalEigenvalue()
  {
    return GetTerminalEigenvalue_41();
  }

  private native void SetNumberOfSides_42(int id0);
  public void SetNumberOfSides(int id0)
  {
    SetNumberOfSides_42(id0);
  }

  private native int GetNumberOfSidesMinValue_43();
  public int GetNumberOfSidesMinValue()
  {
    return GetNumberOfSidesMinValue_43();
  }

  private native int GetNumberOfSidesMaxValue_44();
  public int GetNumberOfSidesMaxValue()
  {
    return GetNumberOfSidesMaxValue_44();
  }

  private native int GetNumberOfSides_45();
  public int GetNumberOfSides()
  {
    return GetNumberOfSides_45();
  }

  private native void SetRadius_46(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_46(id0);
  }

  private native double GetRadiusMinValue_47();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_47();
  }

  private native double GetRadiusMaxValue_48();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_48();
  }

  private native double GetRadius_49();
  public double GetRadius()
  {
    return GetRadius_49();
  }

  private native void SetLogScaling_50(int id0);
  public void SetLogScaling(int id0)
  {
    SetLogScaling_50(id0);
  }

  private native int GetLogScaling_51();
  public int GetLogScaling()
  {
    return GetLogScaling_51();
  }

  private native void LogScalingOn_52();
  public void LogScalingOn()
  {
    LogScalingOn_52();
  }

  private native void LogScalingOff_53();
  public void LogScalingOff()
  {
    LogScalingOff_53();
  }

  public vtkHyperStreamline() { super(); }

  public vtkHyperStreamline(long id) { super(id); }
  public native long   VTKInit();

}
